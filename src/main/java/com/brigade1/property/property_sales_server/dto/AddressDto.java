package com.brigade1.property.property_sales_server.dto;

import jakarta.validation.constraints.Size;

import java.util.Objects;
import java.util.UUID;

/**
 * DTO for {@link com.brigade1.property.property_sales_server.models.Address}
 */
public class AddressDto {
    private UUID id;
    @Size(message = "country should be less than 128 characters", max = 128)
    private String country;
    @Size(message = "region should be less than 128 characters", max = 128)
    private String region;
    @Size(message = "settlement should be less than 128 characters", max = 128)
    private String settlement;
    @Size(message = "public transport description should be less than 512 characters", max = 512)
    private String publicTransport;
    @Size(message = "street should be less than 128 characters", max = 128)
    private String street;
    @Size(message = "building should be less than 128 characters", max = 128)
    private String building;
    @Size(message = "block should be less than 128 characters", max = 128)
    private String block;
    @Size(message = "apartment should be less than 128 characters", max = 128)
    private String apartment;
    @Size(message = "zip code should be less than 32 characters", max = 32)
    private String zipCode;

    public AddressDto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public @Size(message = "country should be less than 128 characters", max = 128) String getCountry() {
        return country;
    }

    public void setCountry(@Size(message = "country should be less than 128 characters", max = 128) String country) {
        this.country = country;
    }

    public @Size(message = "region should be less than 128 characters", max = 128) String getRegion() {
        return region;
    }

    public void setRegion(@Size(message = "region should be less than 128 characters", max = 128) String region) {
        this.region = region;
    }

    public @Size(message = "settlement should be less than 128 characters", max = 128) String getSettlement() {
        return settlement;
    }

    public void setSettlement(@Size(message = "settlement should be less than 128 characters", max = 128) String settlement) {
        this.settlement = settlement;
    }

    public @Size(message = "public transport description should be less than 512 characters", max = 512) String getPublicTransport() {
        return publicTransport;
    }

    public void setPublicTransport(@Size(message = "public transport description should be less than 512 characters", max = 512) String publicTransport) {
        this.publicTransport = publicTransport;
    }

    public @Size(message = "street should be less than 128 characters", max = 128) String getStreet() {
        return street;
    }

    public void setStreet(@Size(message = "street should be less than 128 characters", max = 128) String street) {
        this.street = street;
    }

    public @Size(message = "building should be less than 128 characters", max = 128) String getBuilding() {
        return building;
    }

    public void setBuilding(@Size(message = "building should be less than 128 characters", max = 128) String building) {
        this.building = building;
    }

    public @Size(message = "block should be less than 128 characters", max = 128) String getBlock() {
        return block;
    }

    public void setBlock(@Size(message = "block should be less than 128 characters", max = 128) String block) {
        this.block = block;
    }

    public @Size(message = "apartment should be less than 128 characters", max = 128) String getApartment() {
        return apartment;
    }

    public void setApartment(@Size(message = "apartment should be less than 128 characters", max = 128) String apartment) {
        this.apartment = apartment;
    }

    public @Size(message = "zip code should be less than 32 characters", max = 32) String getZipCode() {
        return zipCode;
    }

    public void setZipCode(@Size(message = "zip code should be less than 32 characters", max = 32) String zipCode) {
        this.zipCode = zipCode;
    }
}