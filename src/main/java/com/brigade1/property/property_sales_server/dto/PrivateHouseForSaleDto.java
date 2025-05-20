package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.PrivateHouseType;
import com.brigade1.property.property_sales_server.models.types.RenovationType;

import java.math.BigDecimal;
import java.util.UUID;

public class PrivateHouseForSaleDto {
    private UUID id;
    private String cadastralNumber;
    private PrivateHouseType privateHouseType;
    private Integer roomsAmount;
    private Integer constructionYear;
    private BigDecimal livingArea;
    private BigDecimal totalArea;
    private Integer ceilingHeight;
    private BigDecimal atticArea;
    private BigDecimal basementArea;
    private RenovationType renovationType;
    private Boolean hasBathroom;
    private Boolean hasToilet;
    private Boolean hasGarage;
    private BigDecimal garageArea;
    private Boolean hasGarden;
    private BigDecimal gardenArea;
    private Boolean hasBalcony;
    private Boolean hasBoiler;
    private Boolean hasFireplace;
    private Boolean hasFurnitureInRooms;
    private Boolean hasFurnitureInKitchen;
    private Boolean hasStreetView;
    private Boolean hasYardView;
    private Boolean isActive;

    public PrivateHouseForSaleDto() {}

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

    public PrivateHouseType getPrivateHouseType() {
        return privateHouseType;
    }

    public void setPrivateHouseType(PrivateHouseType privateHouseType) {
        this.privateHouseType = privateHouseType;
    }

    public Integer getRoomsAmount() {
        return roomsAmount;
    }

    public void setRoomsAmount(Integer roomsAmount) {
        this.roomsAmount = roomsAmount;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public BigDecimal getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(BigDecimal livingArea) {
        this.livingArea = livingArea;
    }

    public BigDecimal getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(BigDecimal totalArea) {
        this.totalArea = totalArea;
    }

    public Integer getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Integer ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public BigDecimal getAtticArea() {
        return atticArea;
    }

    public void setAtticArea(BigDecimal atticArea) {
        this.atticArea = atticArea;
    }

    public BigDecimal getBasementArea() {
        return basementArea;
    }

    public void setBasementArea(BigDecimal basementArea) {
        this.basementArea = basementArea;
    }

    public RenovationType getRenovationType() {
        return renovationType;
    }

    public void setRenovationType(RenovationType renovationType) {
        this.renovationType = renovationType;
    }

    public Boolean getHasBathroom() {
        return hasBathroom;
    }

    public void setHasBathroom(Boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
    }

    public Boolean getHasToilet() {
        return hasToilet;
    }

    public void setHasToilet(Boolean hasToilet) {
        this.hasToilet = hasToilet;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public BigDecimal getGarageArea() {
        return garageArea;
    }

    public void setGarageArea(BigDecimal garageArea) {
        this.garageArea = garageArea;
    }

    public Boolean getHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public BigDecimal getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(BigDecimal gardenArea) {
        this.gardenArea = gardenArea;
    }

    public Boolean getHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public Boolean getHasBoiler() {
        return hasBoiler;
    }

    public void setHasBoiler(Boolean hasBoiler) {
        this.hasBoiler = hasBoiler;
    }

    public Boolean getHasFireplace() {
        return hasFireplace;
    }

    public void setHasFireplace(Boolean hasFireplace) {
        this.hasFireplace = hasFireplace;
    }

    public Boolean getHasFurnitureInRooms() {
        return hasFurnitureInRooms;
    }

    public void setHasFurnitureInRooms(Boolean hasFurnitureInRooms) {
        this.hasFurnitureInRooms = hasFurnitureInRooms;
    }

    public Boolean getHasFurnitureInKitchen() {
        return hasFurnitureInKitchen;
    }

    public void setHasFurnitureInKitchen(Boolean hasFurnitureInKitchen) {
        this.hasFurnitureInKitchen = hasFurnitureInKitchen;
    }

    public Boolean getHasStreetView() {
        return hasStreetView;
    }

    public void setHasStreetView(Boolean hasStreetView) {
        this.hasStreetView = hasStreetView;
    }

    public Boolean getHasYardView() {
        return hasYardView;
    }

    public void setHasYardView(Boolean hasYardView) {
        this.hasYardView = hasYardView;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
