package com.brigade1.property.property_sales_server.controllers;

import com.brigade1.property.property_sales_server.dto.ListingDto;
import com.brigade1.property.property_sales_server.dto.UserDto;
import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.security.User;
import com.brigade1.property.property_sales_server.services.ListingService;
import com.brigade1.property.property_sales_server.services.UserService;
import com.brigade1.property.property_sales_server.util.errorresponse.ListingErrorResponse;
import com.brigade1.property.property_sales_server.util.notcreatedexception.ListingNotCreatedException;
import com.brigade1.property.property_sales_server.util.validator.ListingValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * REST Controller for managing Listing resources.
 * Provides endpoints to get, create, and delete property listings.
 */
@RestController
@RequestMapping("/listings")
public class ListingController {

    private final ListingService listingService;
    private final UserService userService;
    private final ModelMapper modelMapper;
    private final ListingValidator listingValidator;

    /**
     * Constructor for dependency injection of required services and utilities.
     *
     * @param listingService service handling Listing business logic
     * @param userService service for User management
     * @param modelMapper utility for DTO <-> entity mapping
     * @param paintingValidator validator for ListingDto objects
     */
    @Autowired
    public ListingController(ListingService listingService, UserService userService, ModelMapper modelMapper, ListingValidator paintingValidator) {
        this.listingService = listingService;
        this.userService = userService;
        this.modelMapper = modelMapper;
        this.listingValidator = paintingValidator;
    }

    /**
     * Retrieve all listings in the system.
     * @return list of ListingDto
     */
    @GetMapping
    public List<ListingDto> getAll() {
        return listingService.findAll()
                .stream()
                .map(this::toListingDto)
                .toList();
    }

    /**
     * Retrieve a single listing by its UUID.
     * Throws RuntimeException if not found.
     * @param id UUID of the listing
     * @return ListingDto of the requested listing
     */
    @GetMapping("/{id}")
    public ListingDto getOne(@PathVariable UUID id) {
        return listingService.findById(id)
                .map(this::toListingDto)
                .orElseThrow(() -> new RuntimeException("Listing with id " + id + " not found"));
    }

    /**
     * Create a new listing. Validates input and user existence.
     * If validation fails, throws ListingNotCreatedException.
     * @param listingDto DTO representation of the listing to create
     * @param bindingResult holds validation results
     * @return ResponseEntity indicating success or specific failure
     */
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody ListingDto listingDto, BindingResult bindingResult) {
        // Validate the DTO
        listingValidator.validate(listingDto, bindingResult);

        // Check if the user exists
        Optional<User> user = userService.findById(listingDto.getUser().getId());
        if (user.isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body(new ListingErrorResponse("User not found", System.currentTimeMillis()));
        }

        // Handle validation errors
        if (bindingResult.hasErrors()) {
            StringBuilder stringBuilder = new StringBuilder();
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                stringBuilder.append(error.getField())
                        .append(" - ")
                        .append(error.getDefaultMessage())
                        .append("; ");
            }

            throw new ListingNotCreatedException(stringBuilder.toString());
        }

        // Map DTO to entity, set user, and save
        Listing listing = toListing(listingDto);
        listing.setUser(user.get());
        listingService.save(listing);

        return ResponseEntity.ok("Listing created successfully");
    }

    /**
     * Delete a listing by its identifier.
     * @param id UUID of the listing to delete
     * @return ResponseEntity indicating deletion success
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        listingService.deleteById(id);
        return ResponseEntity.ok("Listing deleted successfully");
    }

    // Utility Methods for DTO/entity conversion

    /**
     * Convert Listing entity to ListingDto for output.
     */
    private ListingDto toListingDto(Listing listing) {
        return modelMapper.map(listing, ListingDto.class);
    }

    /**
     * Convert ListingDto to Listing entity.
     */
    private Listing toListing(ListingDto dto) {
        return modelMapper.map(dto, Listing.class);
    }

    /**
     * Convert User entity to UserDto.
     */
    private UserDto toUserDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    /**
     * Convert UserDto to User entity.
     */
    private User toUser(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    /**
     * Exception handler for handling ListingNotCreatedException.
     * Returns a custom error response and a BAD_REQUEST status.
     */
    @ExceptionHandler
    private ResponseEntity<ListingErrorResponse> handleException(ListingNotCreatedException e) {
        ListingErrorResponse response = new ListingErrorResponse(
                e.getMessage(), System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
