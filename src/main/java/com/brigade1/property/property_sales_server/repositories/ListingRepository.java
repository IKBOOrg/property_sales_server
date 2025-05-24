package com.brigade1.property.property_sales_server.repositories;

import com.brigade1.property.property_sales_server.models.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * Repository interface for Listing entities.
 * Inherits basic CRUD and pagination methods from JpaRepository.
 */
@Repository
public interface ListingRepository extends JpaRepository<Listing, UUID> {

    /**
     * Find a Listing by its linked address ID.
     *
     * @param addressId UUID of the Address entity
     * @return Optional containing the Listing if found, or empty if not
     */
    Optional<Listing> findByAddressId(UUID addressId);

    /**
     * Find a Listing by its associated garage's cadastral number.
     *
     * @param cadastralNumber cadastral number of the Garage
     * @return Optional containing the Listing if found, or empty if not
     */
    Optional<Listing> findByGarage_CadastralNumber(String cadastralNumber);

    /**
     * Find a Listing by its associated land plot's cadastral number.
     *
     * @param cadastralNumber cadastral number of the Land Plot
     * @return Optional containing the Listing if found, or empty if not
     */
    Optional<Listing> findByLand_CadastralNumber(String cadastralNumber);

    /**
     * Find a Listing by its associated flat's cadastral number.
     *
     * @param cadastralNumber cadastral number of the Flat
     * @return Optional containing the Listing if found, or empty if not
     */
    Optional<Listing> findByFlat_CadastralNumber(String cadastralNumber);

    /**
     * Find a Listing by its associated private house's cadastral number.
     * Note: There is a typo in the field name ('privateHose' should be 'privateHouse').
     *
     * @param cadastralNumber cadastral number of the Private House
     * @return Optional containing the Listing if found, or empty if not
     */
    Optional<Listing> findByPrivateHose_CadastralNumber(String cadastralNumber);

}
