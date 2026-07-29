package com.vhre.warehouse_service.modules.item.controller;

import com.vhre.warehouse_service.core.base.controller.BaseController;
import com.vhre.warehouse_service.modules.item.dto.ItemDTO;
import com.vhre.warehouse_service.modules.item.entity.Item;
import com.vhre.warehouse_service.modules.item.service.ItemService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/items")
@Tag(name = "Inventory Management", description = "Endpoints for managing cargo items within warehouses")
public class ItemController extends BaseController<Item, ItemDTO, UUID> {
    public ItemController(ItemService service) {
        super(service);
    }
}
