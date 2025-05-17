package com.brigade1.property.property_sales_server.models;

import com.brigade1.property.property_sales_server.models.property_for_sale.FlatForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.GarageForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.LandPlotForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.PrivateHouseForSale;
import com.brigade1.property.property_sales_server.models.types.ListingPropertyType;
import com.brigade1.property.property_sales_server.security.User;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "property_type", nullable = false)
    private ListingPropertyType propertyType;

    @ManyToOne()
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column(name = "created_at", nullable = true, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;

    @Column(name = "is_active", nullable = true)
    private Boolean isActive;

    @OneToOne(mappedBy = "flat")
    private FlatForSale flat;

    @OneToOne(mappedBy = "garage")
    private GarageForSale garage;

    @OneToOne(mappedBy = "land")
    private LandPlotForSale land;

    @OneToOne(mappedBy = "privateHose")
    private PrivateHouseForSale privateHose;

    public Listing() {}

    public Listing(ListingPropertyType propertyType) {
        this.propertyType = propertyType;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public FlatForSale getFlat() {
        return flat;
    }

    public void setFlat(FlatForSale flat) {
        this.flat = flat;
    }

    public GarageForSale getGarage() {
        return garage;
    }

    public void setGarage(GarageForSale garage) {
        this.garage = garage;
    }

    public LandPlotForSale getLand() {
        return land;
    }

    public void setLand(LandPlotForSale land) {
        this.land = land;
    }

    public PrivateHouseForSale getPrivateHose() {
        return privateHose;
    }

    public void setPrivateHose(PrivateHouseForSale privateHose) {
        this.privateHose = privateHose;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "id=" + id +
                ", propertyType=" + propertyType +
                ", user=" + user +
                ", address=" + address +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", isActive=" + isActive +
                ", flat=" + flat +
                ", garage=" + garage +
                ", land=" + land +
                ", privateHose=" + privateHose +
                '}';
    }
}
