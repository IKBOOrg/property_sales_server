package com.brigade1.property.property_sales_server.models.property_for_sale;

import com.brigade1.property.property_sales_server.models.types.GarageType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "garage_for_sale")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "listing_id")
public class GarageForSale extends PropertyForSale {

    @Column(name = "cadastral_number", nullable = false)
    private String cadastralNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "garage_type", nullable = false)
    private GarageType garageType;

    @Column(name = "area", nullable = false, precision = 10, scale = 2)
    private BigDecimal area;

    @Column(name = "ceiling_height")
    private Integer ceilingHeight;

    @Column(name = "construction_year")
    private Integer constructionYear;

    @Column(name = "has_electricity", nullable = false)
    private Boolean hasElectricity;

    @Column(name = "has_heating", nullable = false)
    private Boolean hasHeating;

    @Column(name = "has_water_supply", nullable = false)
    private Boolean hasWaterSupply;

    @Column(name = "has_sewerage", nullable = false)
    private Boolean hasSewerage;

    @Column(name = "has_automatic_door", nullable = false)
    private Boolean hasAutomaticDoor;

    @Column(name = "has_ramp", nullable = false)
    private Boolean hasRamp;

    @Column(name = "parking_spots")
    private Integer parkingSpots;

    @Column(name = "is_reinforced", nullable = false)
    private Boolean isReinforced;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    // Constructors
    public GarageForSale() {}

    // Getters and Setters
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "GarageForSale{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", garageType=" + garageType +
                ", area=" + area +
                ", ceilingHeight=" + ceilingHeight +
                ", constructionYear=" + constructionYear +
                ", hasElectricity=" + hasElectricity +
                ", hasHeating=" + hasHeating +
                ", hasWaterSupply=" + hasWaterSupply +
                ", hasSewerage=" + hasSewerage +
                ", hasAutomaticDoor=" + hasAutomaticDoor +
                ", hasRamp=" + hasRamp +
                ", parkingSpots=" + parkingSpots +
                ", isReinforced=" + isReinforced +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                ", isActive=" + isActive +
                '}';
    }
}
