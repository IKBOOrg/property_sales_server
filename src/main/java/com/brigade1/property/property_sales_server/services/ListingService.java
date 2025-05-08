package com.brigade1.property.property_sales_server.services;

import com.brigade1.property.property_sales_server.repositories.ListingRepository;

import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;
import com.brigade1.property.property_sales_server.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class ListingService {

    private final ListingRepository listingRepository;

    @Autowired
    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    /**
     * Retrieve all listings
     */
    public List<Listing> findAll() {
        return listingRepository.findAll();
    }

    /**
     * Find a listing by its ID
     */
    public Optional<Listing> findById(UUID id) {
        return listingRepository.findById(id);
    }

    /**
     * Find listings by property type
     */
//    public List<Listing> findByPropertyType(ListingPropertyType propertyType) {
//        return listingRepository.findByPropertyType(propertyType);
//    }
//
//    /**
//     * Find listings by owner
//     */
//    public List<Listing> findByOwner(User user) {
//        return listingRepository.findByUser(user);
//    }

    /**
     * Save a new or update an existing listing
     */
    @Transactional
    public Listing save(Listing listing) {
        return listingRepository.save(listing);
    }

    /**
     * Delete a listing by ID
     */
    @Transactional
    public void deleteById(UUID id) {
        listingRepository.deleteById(id);
    }
}
