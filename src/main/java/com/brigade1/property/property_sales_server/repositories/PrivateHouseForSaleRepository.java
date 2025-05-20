package com.brigade1.property.property_sales_server.repositories;

import com.brigade1.property.property_sales_server.models.property_for_sale.LandPlotForSale;
import com.brigade1.property.property_sales_server.models.property_for_sale.PrivateHouseForSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PrivateHouseForSaleRepository extends JpaRepository<PrivateHouseForSale, UUID> {
}
