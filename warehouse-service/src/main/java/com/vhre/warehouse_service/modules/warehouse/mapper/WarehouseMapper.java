package com.vhre.warehouse_service.modules.warehouse.mapper;

import com.vhre.warehouse_service.core.base.mapper.BaseMapper;
import com.vhre.warehouse_service.modules.warehouse.dto.WarehouseDTO;
import com.vhre.warehouse_service.modules.warehouse.entity.Warehouse;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface WarehouseMapper extends BaseMapper<Warehouse, WarehouseDTO> {
    @Mapping(target = "items", ignore = true)
    Warehouse toEntity(WarehouseDTO dto);
}
