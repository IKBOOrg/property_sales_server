package com.brigade1.property.property_sales_server.services;

import com.brigade1.property.property_sales_server.repositories.*;

import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
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


    public Optional<Listing> findByCadastralNumber(String cadastralNumber, ListingPropertyType type) {
        return switch (type) {
            case GARAGE -> listingRepository.findByGarage_CadastralNumber(cadastralNumber);
            case LAND_PLOT -> listingRepository.findByLand_CadastralNumber(cadastralNumber);
            case FLAT -> listingRepository.findByFlat_CadastralNumber(cadastralNumber);
            case PRIVATE_HOUSE -> listingRepository.findByPrivateHose_CadastralNumber(cadastralNumber);
        };
    }


}
