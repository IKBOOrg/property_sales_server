package com.brigade1.property.property_sales_server.controllers;

import com.brigade1.property.property_sales_server.dto.ListingDto;
import com.brigade1.property.property_sales_server.dto.UserDto;
import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.security.User;
import com.brigade1.property.property_sales_server.services.ListingService;
import com.brigade1.property.property_sales_server.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @Autowired
    public ListingController(ListingService listingService, UserService userService, ModelMapper modelMapper) {
        this.listingService = listingService;
        this.userService = userService;
        this.modelMapper = modelMapper;
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

    @PostMapping()
    public ResponseEntity<String> create(@RequestBody ListingDto listingDto) {
        Optional<User> user = userService.findById(listingDto.getUser().getId());

        if (user.isPresent()) {
            Listing listing = toListing(listingDto);
            listing.setUser(user.get());
            listingService.save(listing);
            return ResponseEntity.ok().body("Listing created successfully");
        } else {
            return ResponseEntity.badRequest().body("User not found");
        }
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
}
