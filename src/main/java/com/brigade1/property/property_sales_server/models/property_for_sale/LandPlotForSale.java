package com.brigade1.property.property_sales_server.models.property_for_sale;


import com.brigade1.property.property_sales_server.models.types.*;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "land_plot_for_sale")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "listing_id")
public class LandPlotForSale extends PropertyForSale {

    @Column(name = "cadastral_number", nullable = false, unique = true)
    private String cadastralNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "land_category", nullable = false)
    private LandType landCategory;

    @Enumerated(EnumType.STRING)
    @Column(name = "land_plot_state", nullable = false)
    private LandUseType landPlotState;

    @Column(name = "size_area", nullable = false, precision = 10, scale = 2)
    private BigDecimal sizeArea;

    @Enumerated(EnumType.STRING)
    @Column(name = "sewage", nullable = false)
    private SewageType sewage;

    @Enumerated(EnumType.STRING)
    @Column(name = "water", nullable = false)
    private WaterSourceType water;

    @Enumerated(EnumType.STRING)
    @Column(name = "gas", nullable = false)
    private GasType gas;

    @Column(name = "electricity", nullable = false)
    private Boolean electricity;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    // Constructors
    public LandPlotForSale() {}

    // Getters and Setters
    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public LandType getLandCategory() {
        return landCategory;
    }

    public void setLandCategory(LandType landCategory) {
        this.landCategory = landCategory;
    }

    public LandUseType getLandPlotState() {
        return landPlotState;
    }

    public void setLandPlotState(LandUseType landPlotState) {
        this.landPlotState = landPlotState;
    }

    public BigDecimal getSizeArea() {
        return sizeArea;
    }

    public void setSizeArea(BigDecimal sizeArea) {
        this.sizeArea = sizeArea;
    }

    public SewageType getSewage() {
        return sewage;
    }

    public void setSewage(SewageType sewage) {
        this.sewage = sewage;
    }

    public WaterSourceType getWater() {
        return water;
    }

    public void setWater(WaterSourceType water) {
        this.water = water;
    }

    public GasType getGas() {
        return gas;
    }

    public void setGas(GasType gas) {
        this.gas = gas;
    }

    public Boolean getElectricity() {
        return electricity;
    }

    public void setElectricity(Boolean electricity) {
        this.electricity = electricity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "LandPlotForSale{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
                ", landCategory=" + landCategory +
                ", landPlotState=" + landPlotState +
                ", sizeArea=" + sizeArea +
                ", sewage=" + sewage +
                ", water=" + water +
                ", gas=" + gas +
                ", electricity=" + electricity +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                ", isActive=" + isActive +
                '}';
    }
}
