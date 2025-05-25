package com.brigade1.property.property_sales_server.services;

import com.brigade1.property.property_sales_server.models.Address;
import com.brigade1.property.property_sales_server.models.property_for_sale.FlatForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.GarageForSale;
import com.brigade1.property.property_sales_server.repositories.*;

import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class ListingService {

    private final ListingRepository listingRepository;

    @PersistenceContext
    private EntityManager entityManager;

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

    @Transactional
    public void save(Listing listing) {
        listingRepository.save(listing);
    }

    /**
     * Delete a listing by ID
     */
    @Transactional
    public void deleteById(UUID id) {
        listingRepository.deleteById(id);
    }


    /**
     * Update an existing listing
     */
    @Transactional
    public void update(UUID id, Listing updatedListing) {
        Optional<Listing> existingListingOpt = listingRepository.findById(id);

        if (existingListingOpt.isEmpty()) {
            throw new RuntimeException("Listing with id " + id + " not found");
        }

        Listing existingListing = existingListingOpt.get();

        // Update basic fields
        existingListing.setPropertyType(updatedListing.getPropertyType());
        existingListing.setDescription(updatedListing.getDescription());
        existingListing.setActive(updatedListing.getActive());
        existingListing.setUpdatedAt(new Timestamp(System.currentTimeMillis()));

        // Update address if provided
        if (updatedListing.getAddress() != null) {
            Address updatedAddress = entityManager.merge(updatedListing.getAddress());
            existingListing.setAddress(updatedAddress);
        }


        // Update property-specific details based on property type
        switch (existingListing.getPropertyType()) {
            case FLAT -> {
                if (updatedListing.getFlat() != null) {
                    FlatForSale mergedFlat = entityManager.merge(updatedListing.getFlat());
                    existingListing.setFlat(mergedFlat);
                }
            }
            case GARAGE -> {
                if (updatedListing.getGarage() != null) {
                    GarageForSale mergedGarage = entityManager.merge(updatedListing.getGarage());
                    existingListing.setGarage(mergedGarage);
                }
            }
            case LAND_PLOT -> {
                if (updatedListing.getLand() != null) {
                    existingListing.setLand(updatedListing.getLand());
                }
            }
            case PRIVATE_HOUSE -> {
                if (updatedListing.getPrivateHose() != null) {
                    existingListing.setPrivateHose(updatedListing.getPrivateHose());
                }
            }
        }

        listingRepository.save(existingListing);
    }



    public Optional<Listing> findByCadastralNumber(String cadastralNumber, ListingPropertyType type) {
        return switch (type) {
            case GARAGE -> listingRepository.findByGarage_CadastralNumber(cadastralNumber);
            case LAND_PLOT -> listingRepository.findByLand_CadastralNumber(cadastralNumber);
            case FLAT -> listingRepository.findByFlat_CadastralNumber(cadastralNumber);
            case PRIVATE_HOUSE -> listingRepository.findByPrivateHose_CadastralNumber(cadastralNumber);
        };
    }


}
