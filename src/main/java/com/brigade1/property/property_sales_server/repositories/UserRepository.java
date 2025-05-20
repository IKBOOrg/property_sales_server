package com.brigade1.property.property_sales_server.repositories;

import com.brigade1.property.property_sales_server.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByEmail(String email);
}
