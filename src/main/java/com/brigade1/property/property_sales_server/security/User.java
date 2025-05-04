package com.brigade1.property.property_sales_server.models;

import com.brigade1.property.property_sales_server.models.types.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id", nullable = false, updatable = false)
    private UUID id;

    @Column(name="email", nullable = false, unique = true)
    @Size(max = 256, message = "email cannot be longer than 256 characters")
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name="role", nullable = false)
    Role role;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Listing> listings;

    public User() {
    }

    public User(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
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

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }
}
