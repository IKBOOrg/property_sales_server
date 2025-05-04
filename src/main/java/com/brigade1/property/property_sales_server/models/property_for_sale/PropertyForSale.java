package com.brigade1.property.property_sales_server.models;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "listing_property_sale")
public abstract class PropertyForSale {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "listing_id")
    private Listing listing;

    public PropertyForSale() {}

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
        this.setId(listing.getId());
    }
}
