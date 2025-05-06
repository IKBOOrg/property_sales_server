package com.brigade1.property.property_sales_server.dto;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = FlatForSaleDto.class, name = "flat"),
        @JsonSubTypes.Type(value = PrivateHouseForSaleDto.class, name = "house"),
        @JsonSubTypes.Type(value = GarageForSaleDto.class, name = "garage"),
        @JsonSubTypes.Type(value = LandPlotForSaleDto.class, name = "land_plot"),
})
public class PropertyForSaleDto {
    private UUID id;

    // Empty constructor
    public PropertyForSaleDto() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PropertyForSaleDto{" +
                "id=" + id +
                '}';
    }
}
