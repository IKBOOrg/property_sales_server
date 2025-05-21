package com.brigade1.property.property_sales_server.models.property_for_sale;

import com.brigade1.property.property_sales_server.models.Listing;
import com.brigade1.property.property_sales_server.models.types.PrivateHouseType;
import com.brigade1.property.property_sales_server.models.types.RenovationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "private_house_for_sale")
public class PrivateHouseForSale{

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "cadastral_number")
    private String cadastralNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "private_house_type", nullable = false)
    private PrivateHouseType privateHouseType;

    @Column(name = "rooms_amount", nullable = false)
    private Integer roomsAmount;

    @Column(name = "construction_year")
    private Integer constructionYear;

    @Column(name = "living_area", nullable = false, precision = 10, scale = 2)
    private BigDecimal livingArea;

    @Column(name = "total_area", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalArea;

    @Column(name = "ceiling_height")
    private Integer ceilingHeight;

    @Column(name = "attic_area", precision = 10, scale = 2)
    private BigDecimal atticArea;

    @Column(name = "basement_area", precision = 10, scale = 2)
    private BigDecimal basementArea;

    @Enumerated(EnumType.STRING)
    @Column(name = "renovation_type", nullable = false)
    private RenovationType renovationType;

    @Column(name = "has_bathroom", nullable = false)
    private Boolean hasBathroom;

    @Column(name = "has_toilet", nullable = false)
    private Boolean hasToilet;

    @Column(name = "has_garage", nullable = false)
    private Boolean hasGarage;

    @Column(name = "garage_area", precision = 10, scale = 2)
    private BigDecimal garageArea;

    @Column(name = "has_garden", nullable = false)
    private Boolean hasGarden;

    @Column(name = "garden_area", precision = 10, scale = 2)
    private BigDecimal gardenArea;

    @Column(name = "has_balcony", nullable = false)
    private Boolean hasBalcony;

    @Column(name = "has_boiler", nullable = false)
    private Boolean hasBoiler;

    @Column(name = "has_fireplace", nullable = false)
    private Boolean hasFireplace;

    @Column(name = "has_furniture_in_rooms", nullable = false)
    private Boolean hasFurnitureInRooms;

    @Column(name = "has_furniture_in_kitchen", nullable = false)
    private Boolean hasFurnitureInKitchen;

    @Column(name = "has_street_view", nullable = false)
    private Boolean hasStreetView;

    @Column(name = "has_yard_view", nullable = false)
    private Boolean hasYardView;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Listing listing;

    // Constructors
    public PrivateHouseForSale() {}

    // Getters and Setters
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Listing getListing() {
        return listing;
    }

    public void setListing(Listing listing) {
        this.listing = listing;
    }


    @Override
    public String toString() {
        return "PrivateHouseForSale{" +
                "id=" + id +
                ", cadastralNumber='" + cadastralNumber + '\'' +
                ", privateHouseType=" + privateHouseType +
                ", roomsAmount=" + roomsAmount +
                ", constructionYear=" + constructionYear +
                ", livingArea=" + livingArea +
                ", totalArea=" + totalArea +
                ", ceilingHeight=" + ceilingHeight +
                ", atticArea=" + atticArea +
                ", basementArea=" + basementArea +
                ", renovationType=" + renovationType +
                ", hasBathroom=" + hasBathroom +
                ", hasToilet=" + hasToilet +
                ", hasGarage=" + hasGarage +
                ", garageArea=" + garageArea +
                ", hasGarden=" + hasGarden +
                ", gardenArea=" + gardenArea +
                ", hasBalcony=" + hasBalcony +
                ", hasBoiler=" + hasBoiler +
                ", hasFireplace=" + hasFireplace +
                ", hasFurnitureInRooms=" + hasFurnitureInRooms +
                ", hasFurnitureInKitchen=" + hasFurnitureInKitchen +
                ", hasStreetView=" + hasStreetView +
                ", hasYardView=" + hasYardView +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                ", isActive=" + isActive +
                ", privateHose=" + listing +
                '}';
    }
}
