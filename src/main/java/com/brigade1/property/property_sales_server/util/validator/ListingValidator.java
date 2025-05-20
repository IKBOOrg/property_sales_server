package com.brigade1.property.property_sales_server.util.validator;

import com.brigade1.property.property_sales_server.dto.ListingDto;
import com.brigade1.property.property_sales_server.services.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class ListingValidator implements Validator {

    private final ListingService listingService;

    @Autowired
    public ListingValidator(ListingService listingService) {
        this.listingService = listingService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return ListingDto.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ListingDto listingDto = (ListingDto) target;
        String cadastralNumber = null;

        switch (listingDto.getPropertyType()) {
            case GARAGE -> {
                if (listingDto.getGarage() != null)
                    cadastralNumber = listingDto.getGarage().getCadastralNumber();
            }
            case LAND_PLOT -> {
                if (listingDto.getLand() != null)
                    cadastralNumber = listingDto.getLand().getCadastralNumber();
            }
            case FLAT -> {
                if (listingDto.getFlat() != null)
                    cadastralNumber = listingDto.getFlat().getCadastralNumber();
            }
            case PRIVATE_HOUSE -> {
                if (listingDto.getPrivateHose() != null)
                    cadastralNumber = listingDto.getPrivateHose().getCadastralNumber();
            }
        }

        if (cadastralNumber != null &&
                listingService.findByCadastralNumber(cadastralNumber, listingDto.getPropertyType()).isPresent()) {
            errors.rejectValue("propertyType", "", "Listing with this cadastral number already exists.");
        }
    }
}
