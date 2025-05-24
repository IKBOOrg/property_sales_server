package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.PrivateHouseType;
import com.brigade1.property.property_sales_server.models.types.RenovationType;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

/**
 * DTO for {@link com.brigade1.property.property_sales_server.models.property_for_sale.PrivateHouseForSale}
 */
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

    public PrivateHouseForSaleDto() {
    }

    public PrivateHouseForSaleDto(UUID id, String cadastralNumber, PrivateHouseType privateHouseType, Integer roomsAmount, Integer constructionYear, BigDecimal livingArea, BigDecimal totalArea, Integer ceilingHeight, BigDecimal atticArea, BigDecimal basementArea, RenovationType renovationType, Boolean hasBathroom, Boolean hasToilet, Boolean hasGarage, BigDecimal garageArea, Boolean hasGarden, BigDecimal gardenArea, Boolean hasBalcony, Boolean hasBoiler, Boolean hasFireplace, Boolean hasFurnitureInRooms, Boolean hasFurnitureInKitchen, Boolean hasStreetView, Boolean hasYardView) {
        this.id = id;
        this.cadastralNumber = cadastralNumber;
        this.privateHouseType = privateHouseType;
        this.roomsAmount = roomsAmount;
        this.constructionYear = constructionYear;
        this.livingArea = livingArea;
        this.totalArea = totalArea;
        this.ceilingHeight = ceilingHeight;
        this.atticArea = atticArea;
        this.basementArea = basementArea;
        this.renovationType = renovationType;
        this.hasBathroom = hasBathroom;
        this.hasToilet = hasToilet;
        this.hasGarage = hasGarage;
        this.garageArea = garageArea;
        this.hasGarden = hasGarden;
        this.gardenArea = gardenArea;
        this.hasBalcony = hasBalcony;
        this.hasBoiler = hasBoiler;
        this.hasFireplace = hasFireplace;
        this.hasFurnitureInRooms = hasFurnitureInRooms;
        this.hasFurnitureInKitchen = hasFurnitureInKitchen;
        this.hasStreetView = hasStreetView;
        this.hasYardView = hasYardView;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrivateHouseForSaleDto entity = (PrivateHouseForSaleDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.cadastralNumber, entity.cadastralNumber) &&
                Objects.equals(this.privateHouseType, entity.privateHouseType) &&
                Objects.equals(this.roomsAmount, entity.roomsAmount) &&
                Objects.equals(this.constructionYear, entity.constructionYear) &&
                Objects.equals(this.livingArea, entity.livingArea) &&
                Objects.equals(this.totalArea, entity.totalArea) &&
                Objects.equals(this.ceilingHeight, entity.ceilingHeight) &&
                Objects.equals(this.atticArea, entity.atticArea) &&
                Objects.equals(this.basementArea, entity.basementArea) &&
                Objects.equals(this.renovationType, entity.renovationType) &&
                Objects.equals(this.hasBathroom, entity.hasBathroom) &&
                Objects.equals(this.hasToilet, entity.hasToilet) &&
                Objects.equals(this.hasGarage, entity.hasGarage) &&
                Objects.equals(this.garageArea, entity.garageArea) &&
                Objects.equals(this.hasGarden, entity.hasGarden) &&
                Objects.equals(this.gardenArea, entity.gardenArea) &&
                Objects.equals(this.hasBalcony, entity.hasBalcony) &&
                Objects.equals(this.hasBoiler, entity.hasBoiler) &&
                Objects.equals(this.hasFireplace, entity.hasFireplace) &&
                Objects.equals(this.hasFurnitureInRooms, entity.hasFurnitureInRooms) &&
                Objects.equals(this.hasFurnitureInKitchen, entity.hasFurnitureInKitchen) &&
                Objects.equals(this.hasStreetView, entity.hasStreetView) &&
                Objects.equals(this.hasYardView, entity.hasYardView);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cadastralNumber, privateHouseType, roomsAmount, constructionYear, livingArea, totalArea, ceilingHeight, atticArea, basementArea, renovationType, hasBathroom, hasToilet, hasGarage, garageArea, hasGarden, gardenArea, hasBalcony, hasBoiler, hasFireplace, hasFurnitureInRooms, hasFurnitureInKitchen, hasStreetView, hasYardView);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "cadastralNumber = " + cadastralNumber + ", " +
                "privateHouseType = " + privateHouseType + ", " +
                "roomsAmount = " + roomsAmount + ", " +
                "constructionYear = " + constructionYear + ", " +
                "livingArea = " + livingArea + ", " +
                "totalArea = " + totalArea + ", " +
                "ceilingHeight = " + ceilingHeight + ", " +
                "atticArea = " + atticArea + ", " +
                "basementArea = " + basementArea + ", " +
                "renovationType = " + renovationType + ", " +
                "hasBathroom = " + hasBathroom + ", " +
                "hasToilet = " + hasToilet + ", " +
                "hasGarage = " + hasGarage + ", " +
                "garageArea = " + garageArea + ", " +
                "hasGarden = " + hasGarden + ", " +
                "gardenArea = " + gardenArea + ", " +
                "hasBalcony = " + hasBalcony + ", " +
                "hasBoiler = " + hasBoiler + ", " +
                "hasFireplace = " + hasFireplace + ", " +
                "hasFurnitureInRooms = " + hasFurnitureInRooms + ", " +
                "hasFurnitureInKitchen = " + hasFurnitureInKitchen + ", " +
                "hasStreetView = " + hasStreetView + ", " +
                "hasYardView = " + hasYardView + ")";
    }
}