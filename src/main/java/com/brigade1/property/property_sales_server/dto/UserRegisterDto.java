package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.Role;
import jakarta.validation.constraints.Size;

public class UserRegisterDto {
    @Size(message = "email cannot be longer than 256 characters", max = 256)
    private String email;
    private String password;

    public UserRegisterDto() {
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
}
