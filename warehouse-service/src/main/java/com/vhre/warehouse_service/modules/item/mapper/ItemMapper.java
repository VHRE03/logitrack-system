package com.vhre.warehouse_service.modules.item.mapper;

import com.vhre.warehouse_service.core.base.mapper.BaseMapper;
import com.vhre.warehouse_service.modules.item.dto.ItemDTO;
import com.vhre.warehouse_service.modules.item.entity.Item;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface ItemMapper extends BaseMapper<Item, ItemDTO> {

    @Mapping(source = "warehouse.id", target = "warehouseId")
    ItemDTO toDto(Item entity);

    @Mapping(source = "warehouseId", target = "warehouse.id")
    Item toEntity(ItemDTO dto);
}
