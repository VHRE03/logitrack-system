package com.vhre.warehouse_service.modules.warehouse.controller;

import com.vhre.warehouse_service.core.base.controller.BaseController;
import com.vhre.warehouse_service.modules.warehouse.dto.WarehouseDTO;
import com.vhre.warehouse_service.modules.warehouse.entity.Warehouse;
import com.vhre.warehouse_service.modules.warehouse.service.WarehouseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/warehouses")
@Tag(name = "Warehouse Management", description = "Endpoints for managing physical storage facilities")
public class WarehouseController extends BaseController<Warehouse, WarehouseDTO, UUID> {
    public WarehouseController(WarehouseService service) {
        super(service);
    }
}
