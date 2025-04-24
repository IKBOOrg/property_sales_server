package com.brigade1.property.property_sales_server.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "listing_id", referencedColumnName = "id", nullable = false)
    private Listing listing;

    @Column(name = "photo", nullable = false)
    private String photo;



}
