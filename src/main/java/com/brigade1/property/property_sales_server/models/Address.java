package com.brigade1.property.property_sales_server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Size(max = 128, message = "country should be less than 128 characters")
    @Column(name = "country", nullable = false, length = 128)
    private String country;

    @Size(max = 128, message = "region should be less than 128 characters")
    @Column(name = "region", nullable = false, length = 128)
    private String region;

    @Size(max = 128, message = "settlement should be less than 128 characters")
    @Column(name = "settlement", nullable = false, length = 128)
    private String settlement;

    @Size(max = 2000, message = "public transport description should be less than 512 characters")
    @Column(name = "public_transport", length = 512)
    private String publicTransport;

    @Size(max = 128, message = "street should be less than 128 characters")
    @Column(name = "street", length = 128)
    private String street;

    @Size(max = 128, message = "building should be less than 128 characters")
    @Column(name = "building", nullable = false, length = 128)
    private String building;

    @Size(max = 128, message = "block should be less than 128 characters")
    @Column(name = "block", length = 128)
    private String block;

    @Size(max = 128, message = "apartment should be less than 128 characters")
    @Column(name = "apartment", length = 128)
    private String apartment;

    @Size(max = 32, message = "zip code should be less than 32 characters")
    @Column(name = "zip_code", length = 32)
    private String zipCode;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Listing listing;

    protected Address() {}

    public Address(String country, String region, String settlement, String building) {
        this.country = country;
        this.region = region;
        this.settlement = settlement;
        this.building = building;
    }


    public UUID getId() {
        return id;
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
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", listing=" + listing +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", settlement='" + settlement + '\'' +
                ", publicTransport='" + publicTransport + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", block='" + block + '\'' +
                ", apartment='" + apartment + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
