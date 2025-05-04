package com.brigade1.property.property_sales_server.dto;

import java.util.UUID;

/**
 * Data Transfer Object for Address.
 * Exposes address fields but omits the back-reference to Listing.
 */
public class AddressDto {
    private UUID id;
    private String country;
    private String region;
    private String settlement;
    private String publicTransport;
    private String street;
    private String building;
    private String block;
    private String apartment;
    private String zipCode;

    public AddressDto() {}

    public AddressDto(UUID id,
                      String country,
                      String region,
                      String settlement,
                      String publicTransport,
                      String street,
                      String building,
                      String block,
                      String apartment,
                      String zipCode) {
        this.id = id;
        this.country = country;
        this.region = region;
        this.settlement = settlement;
        this.publicTransport = publicTransport;
        this.street = street;
        this.building = building;
        this.block = block;
        this.apartment = apartment;
        this.zipCode = zipCode;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public void setPublicTransport(String publicTransport) {
        this.publicTransport = publicTransport;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public UUID getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getSettlement() {
        return settlement;
    }

    public String getPublicTransport() {
        return publicTransport;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getBlock() {
        return block;
    }

    public String getApartment() {
        return apartment;
    }

    public String getZipCode() {
        return zipCode;
    }
}
