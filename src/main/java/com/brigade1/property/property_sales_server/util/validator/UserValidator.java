package com.brigade1.property.property_sales_server.util.validator;

import com.brigade1.property.property_sales_server.dto.UserRegisterDto;
import com.brigade1.property.property_sales_server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    private UserService userService;

    @Autowired
    public UserValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return UserRegisterDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserRegisterDto userDto = (UserRegisterDto) target;
        if(userService.findByEmail(userDto.getEmail()).isPresent())
            errors.rejectValue("email", "", "User with this email already exists");
    }
}
