package com.vhre.warehouse_service.modules.warehouse.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.vhre.warehouse_service.core.base.entity.BaseEntity;
import com.vhre.warehouse_service.modules.item.entity.Item;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "warehouses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warehouse extends BaseEntity {
    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Integer capacity;

    @JsonManagedReference
    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<Item> items = new ArrayList<>();
}
