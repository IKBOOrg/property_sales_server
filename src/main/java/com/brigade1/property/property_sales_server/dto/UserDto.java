package com.brigade1.property.property_sales_server.dto;

import java.util.UUID;
import com.brigade1.property.property_sales_server.models.types.Role;

/**
 * Data Transfer Object for User.
 * Exposes user’s id, email, and role.
 */
public class UserDto {
    private UUID id;
    private String email;
    private Role role;

    public UserDto() {}

    public UserDto(UUID id, String email, Role role) {
        this.id = id;
        this.email = email;
        this.role = role;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
