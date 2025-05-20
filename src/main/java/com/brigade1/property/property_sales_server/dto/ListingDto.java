package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;

import java.util.Objects;
import java.util.UUID;

/**
 * DTO for {@link com.brigade1.property.property_sales_server.models.Listing}
 */
public class ListingDto {
    private UUID id;
    private ListingPropertyType propertyType;
    private UserDto user;
    private AddressDto address;
    private FlatForSaleDto flat;
    private GarageForSaleDto garage;
    private LandPlotForSaleDto land;
    private PrivateHouseForSaleDto privateHose;

    public ListingDto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ListingPropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(ListingPropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    public FlatForSaleDto getFlat() {
        return flat;
    }

    public void setFlat(FlatForSaleDto flat) {
        this.flat = flat;
    }

    public GarageForSaleDto getGarage() {
        return garage;
    }

    public void setGarage(GarageForSaleDto garage) {
        this.garage = garage;
    }

    public LandPlotForSaleDto getLand() {
        return land;
    }

    public void setLand(LandPlotForSaleDto land) {
        this.land = land;
    }

    public PrivateHouseForSaleDto getPrivateHose() {
        return privateHose;
    }

    public void setPrivateHose(PrivateHouseForSaleDto privateHose) {
        this.privateHose = privateHose;
    }
}