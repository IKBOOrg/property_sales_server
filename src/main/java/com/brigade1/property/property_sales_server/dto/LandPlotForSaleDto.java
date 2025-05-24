package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.*;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

/**
 * DTO for {@link com.brigade1.property.property_sales_server.models.property_for_sale.LandPlotForSale}
 */
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

    public LandPlotForSaleDto() {
    }

    public LandPlotForSaleDto(UUID id, String cadastralNumber, LandType landCategory, LandUseType landPlotState, BigDecimal sizeArea, SewageType sewage, WaterSourceType water, GasType gas, Boolean electricity, String description) {
        this.id = id;
        this.cadastralNumber = cadastralNumber;
        this.landCategory = landCategory;
        this.landPlotState = landPlotState;
        this.sizeArea = sizeArea;
        this.sewage = sewage;
        this.water = water;
        this.gas = gas;
        this.electricity = electricity;
        this.description = description;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandPlotForSaleDto entity = (LandPlotForSaleDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.cadastralNumber, entity.cadastralNumber) &&
                Objects.equals(this.landCategory, entity.landCategory) &&
                Objects.equals(this.landPlotState, entity.landPlotState) &&
                Objects.equals(this.sizeArea, entity.sizeArea) &&
                Objects.equals(this.sewage, entity.sewage) &&
                Objects.equals(this.water, entity.water) &&
                Objects.equals(this.gas, entity.gas) &&
                Objects.equals(this.electricity, entity.electricity) &&
                Objects.equals(this.description, entity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cadastralNumber, landCategory, landPlotState, sizeArea, sewage, water, gas, electricity, description);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "cadastralNumber = " + cadastralNumber + ", " +
                "landCategory = " + landCategory + ", " +
                "landPlotState = " + landPlotState + ", " +
                "sizeArea = " + sizeArea + ", " +
                "sewage = " + sewage + ", " +
                "water = " + water + ", " +
                "gas = " + gas + ", " +
                "electricity = " + electricity + ", " +
                "description = " + description + ")";
    }
}