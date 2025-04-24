package com.brigade1.property.property_sales_server.models;

import com.brigade1.property.property_sales_server.models.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @Column(name = "id")
    private UUID id;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "The email must be a valid email address")
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    @NotEmpty(message = "Password hash should not be empty")
    @Size(min = 8)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @OneToOne(mappedBy = "user")
    private List<Listing> listing;

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Listing> getListing() {
        return listing;
    }

    public void setListing(List<Listing> listing) {
        this.listing = listing;
    }
}
