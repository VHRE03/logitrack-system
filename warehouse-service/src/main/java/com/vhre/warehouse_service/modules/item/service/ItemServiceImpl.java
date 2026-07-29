package com.vhre.warehouse_service.modules.item.service;

import com.vhre.warehouse_service.core.base.service.BaseServiceImpl;
import com.vhre.warehouse_service.modules.item.dto.ItemDTO;
import com.vhre.warehouse_service.modules.item.entity.Item;
import com.vhre.warehouse_service.modules.item.mapper.ItemMapper;
import com.vhre.warehouse_service.modules.item.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemServiceImpl extends BaseServiceImpl<Item, ItemDTO, UUID> implements ItemService {
    public ItemServiceImpl(ItemRepository repository, ItemMapper mapper) {
        super(repository, mapper);
    }
}
