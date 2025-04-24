package com.brigade1.property.property_sales_server.models;

import com.brigade1.property.property_sales_server.models.enums.FlatHouseType;
import com.brigade1.property.property_sales_server.models.enums.ParkingType;
import com.brigade1.property.property_sales_server.models.enums.RenovationType;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "flat_for_sale")
public class FlatForSale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "cadastral_number")
    @Pattern(regexp = "^\\d{2}:\\d{2}:\\d{6,7}:\\d{2}$")
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
    @Min(1)
    private Integer roomsAmount;

    @Column(name = "total_area", nullable = false, precision = 10, scale = 2)
    @DecimalMin("0.00")
    private BigDecimal totalArea;

    @Column(name = "living_area", precision = 10, scale = 2)
    @DecimalMin("0.00")
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

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "is_active")
    private Boolean isActive = true;



}

