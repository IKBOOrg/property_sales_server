package com.brigade1.property.property_sales_server.dto;

import java.util.UUID;
import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;

/**
 * Data Transfer Object for Listing.
 * Nests UserDto and AddressDto, breaking any bidirectional loops.
 */
public class ListingDto {

    private UUID id;
    private ListingPropertyType propertyType;
    private UserDto user;
    private AddressDto address;
    private PropertyForSaleDto propertyForSale;

    public ListingDto() {}

    public ListingDto(UUID id,
                      ListingPropertyType propertyType,
                      UserDto user,
                      AddressDto address) {
        this.id = id;
        this.propertyType = propertyType;
        this.user = user;
        this.address = address;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPropertyType(ListingPropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public ListingPropertyType getPropertyType() {
        return propertyType;
    }

    public UserDto getUser() {
        return user;
    }

    public AddressDto getAddress() {
        return address;
    }

    public PropertyForSaleDto getPropertyForSale() {
        return propertyForSale;
    }

    public void setPropertyForSale(PropertyForSaleDto propertyForSale) {
        this.propertyForSale = propertyForSale;
    }

    @Override
    public String toString() {
        return "ListingDto{" +
                "id=" + id +
                ", propertyType=" + propertyType +
                ", user=" + user +
                ", address=" + address +
                ", propertyForSale=" + propertyForSale +
                '}';
    }
}
