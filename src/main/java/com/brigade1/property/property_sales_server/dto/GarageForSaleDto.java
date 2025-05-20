package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.GarageType;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

/**
 * DTO for {@link com.brigade1.property.property_sales_server.models.property_for_sale.GarageForSale}
 */
public class GarageForSaleDto {
    private UUID id;
    private String cadastralNumber;
    private GarageType garageType;
    private BigDecimal area;
    private Integer ceilingHeight;
    private Integer constructionYear;
    private Boolean hasElectricity;
    private Boolean hasHeating;
    private Boolean hasWaterSupply;
    private Boolean hasSewerage;
    private Boolean hasAutomaticDoor;
    private Boolean hasRamp;
    private Integer parkingSpots;
    private Boolean isReinforced;

    public GarageForSaleDto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public GarageType getGarageType() {
        return garageType;
    }

    public void setGarageType(GarageType garageType) {
        this.garageType = garageType;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Integer getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Integer ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Boolean getHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(Boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public Boolean getHasHeating() {
        return hasHeating;
    }

    public void setHasHeating(Boolean hasHeating) {
        this.hasHeating = hasHeating;
    }

    public Boolean getHasWaterSupply() {
        return hasWaterSupply;
    }

    public void setHasWaterSupply(Boolean hasWaterSupply) {
        this.hasWaterSupply = hasWaterSupply;
    }

    public Boolean getHasSewerage() {
        return hasSewerage;
    }

    public void setHasSewerage(Boolean hasSewerage) {
        this.hasSewerage = hasSewerage;
    }

    public Boolean getHasAutomaticDoor() {
        return hasAutomaticDoor;
    }

    public void setHasAutomaticDoor(Boolean hasAutomaticDoor) {
        this.hasAutomaticDoor = hasAutomaticDoor;
    }

    public Boolean getHasRamp() {
        return hasRamp;
    }

    public void setHasRamp(Boolean hasRamp) {
        this.hasRamp = hasRamp;
    }

    public Integer getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(Integer parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Boolean getReinforced() {
        return isReinforced;
    }

    public void setReinforced(Boolean reinforced) {
        isReinforced = reinforced;
    }
}