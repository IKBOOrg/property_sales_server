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

    public AddressDto(UUID id, String country, String region, String settlement, String publicTransport, String street, String building, String block, String apartment, String zipCode) {
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getPublicTransport() {
        return publicTransport;
    }

    public void setPublicTransport(String publicTransport) {
        this.publicTransport = publicTransport;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDto entity = (AddressDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.country, entity.country) &&
                Objects.equals(this.region, entity.region) &&
                Objects.equals(this.settlement, entity.settlement) &&
                Objects.equals(this.publicTransport, entity.publicTransport) &&
                Objects.equals(this.street, entity.street) &&
                Objects.equals(this.building, entity.building) &&
                Objects.equals(this.block, entity.block) &&
                Objects.equals(this.apartment, entity.apartment) &&
                Objects.equals(this.zipCode, entity.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, region, settlement, publicTransport, street, building, block, apartment, zipCode);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "country = " + country + ", " +
                "region = " + region + ", " +
                "settlement = " + settlement + ", " +
                "publicTransport = " + publicTransport + ", " +
                "street = " + street + ", " +
                "building = " + building + ", " +
                "block = " + block + ", " +
                "apartment = " + apartment + ", " +
                "zipCode = " + zipCode + ")";
    }
}