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

    public GarageForSaleDto(UUID id, String cadastralNumber, GarageType garageType, BigDecimal area, Integer ceilingHeight, Integer constructionYear, Boolean hasElectricity, Boolean hasHeating, Boolean hasWaterSupply, Boolean hasSewerage, Boolean hasAutomaticDoor, Boolean hasRamp, Integer parkingSpots, Boolean isReinforced) {
        this.id = id;
        this.cadastralNumber = cadastralNumber;
        this.garageType = garageType;
        this.area = area;
        this.ceilingHeight = ceilingHeight;
        this.constructionYear = constructionYear;
        this.hasElectricity = hasElectricity;
        this.hasHeating = hasHeating;
        this.hasWaterSupply = hasWaterSupply;
        this.hasSewerage = hasSewerage;
        this.hasAutomaticDoor = hasAutomaticDoor;
        this.hasRamp = hasRamp;
        this.parkingSpots = parkingSpots;
        this.isReinforced = isReinforced;
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

    public Boolean getIsReinforced() {
        return isReinforced;
    }

    public void setIsReinforced(Boolean isReinforced) {
        this.isReinforced = isReinforced;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GarageForSaleDto entity = (GarageForSaleDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.cadastralNumber, entity.cadastralNumber) &&
                Objects.equals(this.garageType, entity.garageType) &&
                Objects.equals(this.area, entity.area) &&
                Objects.equals(this.ceilingHeight, entity.ceilingHeight) &&
                Objects.equals(this.constructionYear, entity.constructionYear) &&
                Objects.equals(this.hasElectricity, entity.hasElectricity) &&
                Objects.equals(this.hasHeating, entity.hasHeating) &&
                Objects.equals(this.hasWaterSupply, entity.hasWaterSupply) &&
                Objects.equals(this.hasSewerage, entity.hasSewerage) &&
                Objects.equals(this.hasAutomaticDoor, entity.hasAutomaticDoor) &&
                Objects.equals(this.hasRamp, entity.hasRamp) &&
                Objects.equals(this.parkingSpots, entity.parkingSpots) &&
                Objects.equals(this.isReinforced, entity.isReinforced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cadastralNumber, garageType, area, ceilingHeight, constructionYear, hasElectricity, hasHeating, hasWaterSupply, hasSewerage, hasAutomaticDoor, hasRamp, parkingSpots, isReinforced);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "cadastralNumber = " + cadastralNumber + ", " +
                "garageType = " + garageType + ", " +
                "area = " + area + ", " +
                "ceilingHeight = " + ceilingHeight + ", " +
                "constructionYear = " + constructionYear + ", " +
                "hasElectricity = " + hasElectricity + ", " +
                "hasHeating = " + hasHeating + ", " +
                "hasWaterSupply = " + hasWaterSupply + ", " +
                "hasSewerage = " + hasSewerage + ", " +
                "hasAutomaticDoor = " + hasAutomaticDoor + ", " +
                "hasRamp = " + hasRamp + ", " +
                "parkingSpots = " + parkingSpots + ", " +
                "isReinforced = " + isReinforced + ")";
    }
}