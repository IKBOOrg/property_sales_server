package com.brigade1.property.property_sales_server.repositories;

import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;
import com.brigade1.property.property_sales_server.security.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ListingRepository extends JpaRepository<Listing, UUID> {

//    List<Listing> findByPropertyType(ListingPropertyType propertyType);
//
//    List<Listing> findByUser(User user);

    Optional<Listing> findByAddressId(UUID addressId);

//
//    List<Listing> findByPropertyTypeIn(List<ListingPropertyType> propertyTypes);

    // это все для валидатора
    Optional<Listing> findByGarage_CadastralNumber(String cadastralNumber);

    Optional<Listing> findByLand_CadastralNumber(String cadastralNumber);

    Optional<Listing> findByFlat_CadastralNumber(String cadastralNumber);

    Optional<Listing> findByPrivateHose_CadastralNumber(String cadastralNumber);
}
