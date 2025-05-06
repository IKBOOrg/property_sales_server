package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.*;

import java.math.BigDecimal;
import java.util.UUID;

public class LandPlotForSaleDto {
    private UUID id;
    private String cadastralNumber;
    private LandType landCategory;
    private LandUseType landPlotState;
    private BigDecimal sizeArea;
    private SewageType sewage;
    private WaterSourceType water;
    private GasType gas;
    private Boolean electricity;
    private String description;
    private Boolean isActive;

    // Empty constructor
    public LandPlotForSaleDto() {}

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

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "LandPlotForSaleDto{" +
                "id=" + id +
                ", cadastralNumber='" + cadastralNumber + '\'' +
                ", landCategory=" + landCategory +
                ", landPlotState=" + landPlotState +
                ", sizeArea=" + sizeArea +
                ", sewage=" + sewage +
                ", water=" + water +
                ", gas=" + gas +
                ", electricity=" + electricity +
                ", description='" + description + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
