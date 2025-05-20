package com.brigade1.property.property_sales_server.services;

import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.repositories.UserRepository;
import com.brigade1.property.property_sales_server.security.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }

    public boolean doesExist(UUID id) {
        return userRepository.existsById(id);
    }
}
