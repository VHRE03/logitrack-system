package com.vhre.warehouse_service.modules.warehouse.repository;

import com.vhre.warehouse_service.modules.warehouse.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, UUID> {
}
