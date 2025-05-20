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

@RestController
@RequestMapping("/listings")
public class ListingController {

    private final ListingService listingService;
    private final UserService userService;
    private final ModelMapper modelMapper;
    private final ListingValidator listingValidator;

    @Autowired
    public ListingController(ListingService listingService, UserService userService, ModelMapper modelMapper, ListingValidator paintingValidator) {
        this.listingService = listingService;
        this.userService = userService;
        this.modelMapper = modelMapper;
        this.listingValidator = paintingValidator;
    }

    @GetMapping
    public List<ListingDto> getAll() {
        return listingService.findAll()
                .stream()
                .map(this::toListingDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ListingDto getOne(@PathVariable UUID id) {
        return listingService.findById(id)
                .map(this::toListingDto)
                .orElseThrow(() -> new RuntimeException("Listing with id " + id + " not found"));
    }

    @PostMapping("/add")
    public ResponseEntity<?> create(@RequestBody ListingDto listingDto, BindingResult bindingResult) {
        listingValidator.validate(listingDto, bindingResult);

        Optional<User> user = userService.findById(listingDto.getUser().getId());
        if (user.isEmpty()) {
            return ResponseEntity
                    .badRequest()
                    .body(new ListingErrorResponse("User not found", System.currentTimeMillis()));
        }

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

        Listing listing = toListing(listingDto);
        listing.setUser(user.get());
        listingService.save(listing);

        return ResponseEntity.ok("Listing created successfully");
    }

    private ListingDto toListingDto(Listing listing) {
        return modelMapper.map(listing, ListingDto.class);
    }

    private Listing toListing(ListingDto dto) {
        return modelMapper.map(dto, Listing.class);
    }

    private UserDto toUserDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    private User toUser(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }


    @ExceptionHandler
    private ResponseEntity<ListingErrorResponse> handleException(ListingNotCreatedException e) {
        ListingErrorResponse response = new ListingErrorResponse(
                e.getMessage(), System.currentTimeMillis()
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
