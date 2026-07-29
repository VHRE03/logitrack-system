package com.vhre.warehouse_service.modules.warehouse.service;

import com.vhre.warehouse_service.core.base.service.BaseService;
import com.vhre.warehouse_service.core.base.service.BaseServiceImpl;
import com.vhre.warehouse_service.modules.warehouse.dto.WarehouseDTO;
import com.vhre.warehouse_service.modules.warehouse.entity.Warehouse;
import com.vhre.warehouse_service.modules.warehouse.mapper.WarehouseMapper;
import com.vhre.warehouse_service.modules.warehouse.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class WarehouseServiceImpl extends BaseServiceImpl<Warehouse, WarehouseDTO, UUID> implements WarehouseService {
    public WarehouseServiceImpl(WarehouseRepository repository, WarehouseMapper mapper) {
        super(repository, mapper);
    }
}