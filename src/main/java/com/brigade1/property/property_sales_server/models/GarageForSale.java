package com.brigade1.property.property_sales_server.models;


import com.brigade1.property.property_sales_server.models.enums.GarageType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "garage_for_sale")
public class GarageForSale {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

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
    private boolean hasElectricity = false;

    @Column(name = "has_heating", nullable = false)
    private boolean hasHeating = false;

    @Column(name = "has_water_supply", nullable = false)
    private boolean hasWaterSupply = false;

    @Column(name = "has_sewerage", nullable = false)
    private boolean hasSewerage = false;

    @Column(name = "has_automatic_door", nullable = false)
    private boolean hasAutomaticDoor = false;

    @Column(name = "has_ramp", nullable = false)
    private boolean hasRamp = false;

    @Column(name = "parking_spots")
    private Integer parkingSpots;

    @Column(name = "is_reinforced", nullable = false)
    private boolean isReinforced = false;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;

    public GarageForSale() {
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

    public boolean isHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public boolean isHasHeating() {
        return hasHeating;
    }

    public void setHasHeating(boolean hasHeating) {
        this.hasHeating = hasHeating;
    }

    public boolean isHasWaterSupply() {
        return hasWaterSupply;
    }

    public void setHasWaterSupply(boolean hasWaterSupply) {
        this.hasWaterSupply = hasWaterSupply;
    }

    public boolean isHasSewerage() {
        return hasSewerage;
    }

    public void setHasSewerage(boolean hasSewerage) {
        this.hasSewerage = hasSewerage;
    }

    public boolean isHasAutomaticDoor() {
        return hasAutomaticDoor;
    }

    public void setHasAutomaticDoor(boolean hasAutomaticDoor) {
        this.hasAutomaticDoor = hasAutomaticDoor;
    }

    public boolean isHasRamp() {
        return hasRamp;
    }

    public void setHasRamp(boolean hasRamp) {
        this.hasRamp = hasRamp;
    }

    public Integer getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(Integer parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public boolean isReinforced() {
        return isReinforced;
    }

    public void setReinforced(boolean reinforced) {
        isReinforced = reinforced;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
