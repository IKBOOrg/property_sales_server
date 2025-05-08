package com.brigade1.property.property_sales_server.models.property_for_sale;

import com.brigade1.property.property_sales_server.models.types.FlatHouseType;
import com.brigade1.property.property_sales_server.models.types.ParkingType;
import com.brigade1.property.property_sales_server.models.types.RenovationType;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "flat_for_sale")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "listing_id")
public class FlatForSale extends PropertyForSale {

    @Column(name = "cadastral_number")
    private String cadastralNumber;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "house_floor_amount")
    private Integer houseFloorAmount;

    @Column(name = "construction_year")
    private Integer constructionYear;

    @Column(name = "ceiling_height")
    private Integer ceilingHeight;

    @Column(name = "flat_number", length = 5)
    private String flatNumber;

    @Column(name = "rooms_amount")
    private Integer roomsAmount;

    @Column(name = "total_area", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalArea;

    @Column(name = "living_area", precision = 10, scale = 2)
    private BigDecimal livingArea;

    @Column(name = "logia_amount")
    private Integer logiaAmount;

    @Column(name = "balcony_amount")
    private Integer balconyAmount;

    @Column(name = "bathroom_amount")
    private Integer bathroomAmount;

    @Column(name = "combined_bathroom_amount")
    private Integer combinedBathroomAmount;

    @Column(name = "has_street_view")
    private Boolean hasStreetView;

    @Column(name = "has_yard_view")
    private Boolean hasYardView;

    @Enumerated(EnumType.STRING)
    @Column(name = "renovation_type", nullable = false)
    private RenovationType renovationType;

    @Column(name = "cargo_elevator_amount")
    private Integer cargoElevatorAmount;

    @Column(name = "passenger_elevator_amount")
    private Integer passengerElevatorAmount;

    @Column(name = "has_wheelchair_ramp")
    private Boolean hasWheelchairRamp;

    @Column(name = "has_garbage_chute")
    private Boolean hasGarbageChute;

    @Enumerated(EnumType.STRING)
    @Column(name = "parking_type")
    private ParkingType parkingType;

    @Column(name = "has_furniture_in_rooms")
    private Boolean hasFurnitureInRooms;

    @Column(name = "has_furniture_in_kitchen")
    private Boolean hasFurnitureInKitchen;

    @Column(name = "has_bath")
    private Boolean hasBath;

    @Column(name = "has_shower_cabin")
    private Boolean hasShowerCabin;

    @Column(name = "has_air_conditioner")
    private Boolean hasAirConditioner;

    @Column(name = "has_refrigerator")
    private Boolean hasRefrigerator;

    @Column(name = "has_tv")
    private Boolean hasTv;

    @Column(name = "has_dishwasher")
    private Boolean hasDishwasher;

    @Column(name = "has_washing_machine")
    private Boolean hasWashingMachine;

    @Enumerated(EnumType.STRING)
    @Column(name = "flat_house_type")
    private FlatHouseType flatHouseType;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "is_active")
    private Boolean isActive;

    // Constructors
    public FlatForSale() {}

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    // Getters and Setters
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
        return "FlatForSale{" +
                "cadastralNumber='" + cadastralNumber + '\'' +
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
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                ", isActive=" + isActive +
                '}';
    }
}
