package com.vhre.warehouse_service.modules.item.repository;

import com.vhre.warehouse_service.modules.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID> {
}