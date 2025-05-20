package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.Role;
import jakarta.validation.constraints.Size;

import java.util.Objects;
import java.util.UUID;

/**
 * DTO for {@link com.brigade1.property.property_sales_server.security.User}
 */
public class UserDto {
    private UUID id;
    @Size(message = "email cannot be longer than 256 characters", max = 256)
    private String email;
    private String password;
    private Role role;

    public UserDto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public @Size(message = "email cannot be longer than 256 characters", max = 256) String getEmail() {
        return email;
    }

    public void setEmail(@Size(message = "email cannot be longer than 256 characters", max = 256) String email) {
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
}