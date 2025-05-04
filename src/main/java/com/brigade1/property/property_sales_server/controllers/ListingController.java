package com.brigade1.property.property_sales_server.controllers;

import com.brigade1.property.property_sales_server.dto.ListingDto;
import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.services.ListingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listings")
public class ListingController {

    private final ListingService listingService;
    private final ModelMapper modelMapper;

    @Autowired
    public ListingController(ListingService listingService, ModelMapper modelMapper) {
        this.listingService = listingService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<ListingDto> getAll() {
        return listingService.findAll()
                .stream()
                .map(this::toListingDto)
                .toList();
    }

    private ListingDto toListingDto(Listing listing) {
        return modelMapper.map(listing, ListingDto.class);
    }

    private Listing toListing(ListingDto dto) {
        return modelMapper.map(dto, Listing.class);
    }
}
