package com.brigade1.property.property_sales_server.dto;

import com.brigade1.property.property_sales_server.models.types.FlatHouseType;
import com.brigade1.property.property_sales_server.models.types.ParkingType;
import com.brigade1.property.property_sales_server.models.types.RenovationType;

import java.math.BigDecimal;
import java.util.UUID;

public class FlatForSaleDto {
    private UUID id;
    private String cadastralNumber;
    private Integer floor;
    private Integer houseFloorAmount;
    private Integer constructionYear;
    private Integer ceilingHeight;
    private String flatNumber;
    private Integer roomsAmount;
    private BigDecimal totalArea;
    private BigDecimal livingArea;
    private Integer logiaAmount;
    private Integer balconyAmount;
    private Integer bathroomAmount;
    private Integer combinedBathroomAmount;
    private Boolean hasStreetView;
    private Boolean hasYardView;
    private RenovationType renovationType;
    private Integer cargoElevatorAmount;
    private Integer passengerElevatorAmount;
    private Boolean hasWheelchairRamp;
    private Boolean hasGarbageChute;
    private ParkingType parkingType;
    private Boolean hasFurnitureInRooms;
    private Boolean hasFurnitureInKitchen;
    private Boolean hasBath;
    private Boolean hasShowerCabin;
    private Boolean hasAirConditioner;
    private Boolean hasRefrigerator;
    private Boolean hasTv;
    private Boolean hasDishwasher;
    private Boolean hasWashingMachine;
    private FlatHouseType flatHouseType;
    private Boolean isActive;

    // Empty constructor
    public FlatForSaleDto() {}

    // get/set

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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getHouseFloorAmount() {
        return houseFloorAmount;
    }

    public void setHouseFloorAmount(Integer houseFloorAmount) {
        this.houseFloorAmount = houseFloorAmount;
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Integer getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(Integer ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Integer getRoomsAmount() {
        return roomsAmount;
    }

    public void setRoomsAmount(Integer roomsAmount) {
        this.roomsAmount = roomsAmount;
    }

    public BigDecimal getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(BigDecimal totalArea) {
        this.totalArea = totalArea;
    }

    public BigDecimal getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(BigDecimal livingArea) {
        this.livingArea = livingArea;
    }

    public Integer getLogiaAmount() {
        return logiaAmount;
    }

    public void setLogiaAmount(Integer logiaAmount) {
        this.logiaAmount = logiaAmount;
    }

    public Integer getBalconyAmount() {
        return balconyAmount;
    }

    public void setBalconyAmount(Integer balconyAmount) {
        this.balconyAmount = balconyAmount;
    }

    public Integer getBathroomAmount() {
        return bathroomAmount;
    }

    public void setBathroomAmount(Integer bathroomAmount) {
        this.bathroomAmount = bathroomAmount;
    }

    public Integer getCombinedBathroomAmount() {
        return combinedBathroomAmount;
    }

    public void setCombinedBathroomAmount(Integer combinedBathroomAmount) {
        this.combinedBathroomAmount = combinedBathroomAmount;
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

    public RenovationType getRenovationType() {
        return renovationType;
    }

    public void setRenovationType(RenovationType renovationType) {
        this.renovationType = renovationType;
    }

    public Integer getCargoElevatorAmount() {
        return cargoElevatorAmount;
    }

    public void setCargoElevatorAmount(Integer cargoElevatorAmount) {
        this.cargoElevatorAmount = cargoElevatorAmount;
    }

    public Integer getPassengerElevatorAmount() {
        return passengerElevatorAmount;
    }

    public void setPassengerElevatorAmount(Integer passengerElevatorAmount) {
        this.passengerElevatorAmount = passengerElevatorAmount;
    }

    public Boolean getHasWheelchairRamp() {
        return hasWheelchairRamp;
    }

    public void setHasWheelchairRamp(Boolean hasWheelchairRamp) {
        this.hasWheelchairRamp = hasWheelchairRamp;
    }

    public Boolean getHasGarbageChute() {
        return hasGarbageChute;
    }

    public void setHasGarbageChute(Boolean hasGarbageChute) {
        this.hasGarbageChute = hasGarbageChute;
    }

    public ParkingType getParkingType() {
        return parkingType;
    }

    public void setParkingType(ParkingType parkingType) {
        this.parkingType = parkingType;
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

    public Boolean getHasBath() {
        return hasBath;
    }

    public void setHasBath(Boolean hasBath) {
        this.hasBath = hasBath;
    }

    public Boolean getHasShowerCabin() {
        return hasShowerCabin;
    }

    public void setHasShowerCabin(Boolean hasShowerCabin) {
        this.hasShowerCabin = hasShowerCabin;
    }

    public Boolean getHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(Boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public Boolean getHasRefrigerator() {
        return hasRefrigerator;
    }

    public void setHasRefrigerator(Boolean hasRefrigerator) {
        this.hasRefrigerator = hasRefrigerator;
    }

    public Boolean getHasTv() {
        return hasTv;
    }

    public void setHasTv(Boolean hasTv) {
        this.hasTv = hasTv;
    }

    public Boolean getHasDishwasher() {
        return hasDishwasher;
    }

    public void setHasDishwasher(Boolean hasDishwasher) {
        this.hasDishwasher = hasDishwasher;
    }

    public Boolean getHasWashingMachine() {
        return hasWashingMachine;
    }

    public void setHasWashingMachine(Boolean hasWashingMachine) {
        this.hasWashingMachine = hasWashingMachine;
    }

    public FlatHouseType getFlatHouseType() {
        return flatHouseType;
    }

    public void setFlatHouseType(FlatHouseType flatHouseType) {
        this.flatHouseType = flatHouseType;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "FlatForSaleDto{" +
                "id=" + id +
                ", cadastralNumber='" + cadastralNumber + '\'' +
                ", floor=" + floor +
                ", houseFloorAmount=" + houseFloorAmount +
                ", constructionYear=" + constructionYear +
                ", ceilingHeight=" + ceilingHeight +
                ", flatNumber='" + flatNumber + '\'' +
                ", roomsAmount=" + roomsAmount +
                ", totalArea=" + totalArea +
                ", livingArea=" + livingArea +
                ", logiaAmount=" + logiaAmount +
                ", balconyAmount=" + balconyAmount +
                ", bathroomAmount=" + bathroomAmount +
                ", combinedBathroomAmount=" + combinedBathroomAmount +
                ", hasStreetView=" + hasStreetView +
                ", hasYardView=" + hasYardView +
                ", renovationType=" + renovationType +
                ", cargoElevatorAmount=" + cargoElevatorAmount +
                ", passengerElevatorAmount=" + passengerElevatorAmount +
                ", hasWheelchairRamp=" + hasWheelchairRamp +
                ", hasGarbageChute=" + hasGarbageChute +
                ", parkingType=" + parkingType +
                ", hasFurnitureInRooms=" + hasFurnitureInRooms +
                ", hasFurnitureInKitchen=" + hasFurnitureInKitchen +
                ", hasBath=" + hasBath +
                ", hasShowerCabin=" + hasShowerCabin +
                ", hasAirConditioner=" + hasAirConditioner +
                ", hasRefrigerator=" + hasRefrigerator +
                ", hasTv=" + hasTv +
                ", hasDishwasher=" + hasDishwasher +
                ", hasWashingMachine=" + hasWashingMachine +
                ", flatHouseType=" + flatHouseType +
                ", isActive=" + isActive +
                '}';
    }
}
