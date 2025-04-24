package com.brigade1.property.property_sales_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    @OneToOne
    @JoinColumn(name = "listing_id", referencedColumnName = "id", nullable = false)
    private Listing listing;

    @Max(value = 128, message = "Country should not be more than 128")
    @Column(name = "country", nullable = false)
    private String country;

    @Max(value = 128, message = "Region should not be more than 128")
    @Column(name = "region", nullable = false)
    private String region;

    @Max(value = 128, message = "Settlement should not be more than 128")
    @Column(name = "settlement", nullable = false)
    private String settlement;

    @Max(value = 128, message = "Public transport should not be more than 128")
    @Column(name = "public_transport", nullable = false)
    private String public_transport;

    @Max(value = 128, message = "Street transport should not be more than 128")
    @Column(name = "street")
    private String street;

    @Max(value = 128, message = "Building transport should not be more than 128")
    @Column(name = "building", nullable = false)
    private String building;

    @Max(value = 128, message = "Block transport should not be more than 128")
    @Column(name = "block")
    private String block;

    @Max(value = 128, message = "Apartment transport should not be more than 128")
    @Column(name = "apartment")
    private String apartment;

    @Max(value = 32, message = "Zip code transport should not be more than 32")
    @Column(name = "zip_code")
    private String zip_code;

    public Address() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
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

    public String getPublic_transport() {
        return public_transport;
    }

    public void setPublic_transport(String public_transport) {
        this.public_transport = public_transport;
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

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }
}
