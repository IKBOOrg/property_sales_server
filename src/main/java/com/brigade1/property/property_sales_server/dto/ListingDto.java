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

    public ListingDto(UUID id, ListingPropertyType propertyType, UserDto user, AddressDto address, FlatForSaleDto flat, GarageForSaleDto garage, LandPlotForSaleDto land, PrivateHouseForSaleDto privateHose) {
        this.id = id;
        this.propertyType = propertyType;
        this.user = user;
        this.address = address;
        this.flat = flat;
        this.garage = garage;
        this.land = land;
        this.privateHose = privateHose;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListingDto entity = (ListingDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.propertyType, entity.propertyType) &&
                Objects.equals(this.user, entity.user) &&
                Objects.equals(this.address, entity.address) &&
                Objects.equals(this.flat, entity.flat) &&
                Objects.equals(this.garage, entity.garage) &&
                Objects.equals(this.land, entity.land) &&
                Objects.equals(this.privateHose, entity.privateHose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, propertyType, user, address, flat, garage, land, privateHose);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "propertyType = " + propertyType + ", " +
                "user = " + user + ", " +
                "address = " + address + ", " +
                "flat = " + flat + ", " +
                "garage = " + garage + ", " +
                "land = " + land + ", " +
                "privateHose = " + privateHose + ")";
    }
}