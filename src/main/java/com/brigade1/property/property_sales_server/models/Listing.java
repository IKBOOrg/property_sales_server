package com.brigade1.property.property_sales_server.models;

import com.brigade1.property.property_sales_server.models.property_for_sale.FlatForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.GarageForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.LandPlotForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.PrivateHouseForSale;
import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;
import com.brigade1.property.property_sales_server.security.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * Entity representing a real estate listing.
 */
@Entity
@Table(name = "listing")
public class Listing {

    /**
     * Unique identifier for the listing.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    /**
     * Type of property (e.g. flat, garage, land, private house).
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "property_type", nullable = false)
    private ListingPropertyType propertyType;

    /**
     * User who created this listing.
     */
    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    /**
     * Address related to this listing (one-to-one relationship).
     */
    @OneToOne(mappedBy = "listing", cascade = CascadeType.ALL, orphanRemoval = true, optional = false)
    private Address address;

    /**
     * Timestamp when the listing was created.
     */
    @Column(name = "created_at", updatable = false)
    private Timestamp createdAt;

    /**
     * Timestamp when the listing was last updated.
     */
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    /**
     * Indicates whether the listing is active.
     */
    @Column(name = "is_active")
    private Boolean isActive;

    /**
     * Description of the property.
     */
    @Column(name = "description", nullable = false)
    private String description;

    /**
     * Flat details if this listing is for a flat.
     */
    @OneToOne(mappedBy = "listing", cascade = CascadeType.ALL)
    private FlatForSale flat;

    /**
     * Garage details if this listing is for a garage.
     */
    @OneToOne(mappedBy = "listing", cascade = CascadeType.ALL)
    private GarageForSale garage;

    /**
     * Land plot details if this listing is for a land plot.
     */
    @OneToOne(mappedBy = "listing", cascade = CascadeType.ALL)
    private LandPlotForSale land;

    /**
     * Private house details if this listing is for a private house.
     */
    @OneToOne(mappedBy = "listing", cascade = CascadeType.ALL)
    private PrivateHouseForSale privateHose;

    /**
     * Default constructor.
     */
    public Listing() {}

    // Getters and setters with comments

    /**
     * Gets the unique ID of the listing.
     */
    public UUID getId() {
        return id;
    }

    /**
     * Sets the unique ID of the listing.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Gets the property type for this listing.
     */
    public ListingPropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the property type for this listing.
     */
    public void setPropertyType(ListingPropertyType propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * Gets the user who created the listing.
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user who created the listing.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets the address for this listing.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address for this listing and sets back-reference.
     */
    public void setAddress(Address address) {
        this.address = address;
        address.setListing(this); // Ensure bidirectional relationship
    }

    /**
     * Gets the creation timestamp.
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the creation timestamp.
     */
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the last update timestamp.
     */
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the last update timestamp.
     */
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Checks if the listing is active.
     */
    public Boolean getActive() {
        return isActive;
    }

    /**
     * Sets whether the listing is active.
     */
    public void setActive(Boolean active) {
        isActive = active;
    }

    /**
     * Gets the description of the property.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the property.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the flat details, if applicable.
     */
    public FlatForSale getFlat() {
        return flat;
    }

    /**
     * Sets the flat details, including back-reference.
     */
    public void setFlat(FlatForSale flat) {
        this.flat = flat;
        flat.setListing(this); // Ensure bidirectional relationship
    }

    /**
     * Gets the garage details, if applicable.
     */
    public GarageForSale getGarage() {
        return garage;
    }

    /**
     * Sets the garage details, including back-reference.
     */
    public void setGarage(GarageForSale garage) {
        this.garage = garage;
        garage.setListing(this); // Ensure bidirectional relationship
    }

    /**
     * Gets the land plot details, if applicable.
     */
    public LandPlotForSale getLand() {
        return land;
    }

    /**
     * Sets the land plot details, including back-reference.
     */
    public void setLand(LandPlotForSale land) {
        this.land = land;
        land.setListing(this); // Ensure bidirectional relationship
    }

    /**
     * Gets the private house details, if applicable.
     */
    public PrivateHouseForSale getPrivateHose() {
        return privateHose;
    }

    /**
     * Sets the private house details, including back-reference.
     */
    public void setPrivateHose(PrivateHouseForSale privateHose) {
        this.privateHose = privateHose;
        privateHose.setListing(this); // Ensure bidirectional relationship
    }
}
