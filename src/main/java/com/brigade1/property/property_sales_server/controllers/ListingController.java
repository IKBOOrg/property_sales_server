package controllers;
import com.brigade1.property.property_sales_server.dto.ListingDto;
import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.repositories.ListingRepository;
import com.brigade1.property.property_sales_server.services.ListingService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/listings")
public class ListingController {

    private final ListingService listingService;

    private final ObjectMapper objectMapper;

    public ListingController(ListingRepository listingRepository, ListingService listingService,
                             ObjectMapper objectMapper) {
        this.listingService = listingService;
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public List<Listing> getAll() {
        return listingService.findAll();
    }

    @GetMapping("/{id}")
    public Listing getOne(@PathVariable UUID id) {
        return null;
    }

    @PostMapping
    public Listing create(@RequestBody ListingDto newListing) {
        return null;
    }

    @PatchMapping("/{id}")
    public void patch(@PathVariable UUID id, @RequestBody ListingDto updatedListing)  {

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {

    }

    public ListingDto toDto(Listing listing) {
        return null;
    }
}
