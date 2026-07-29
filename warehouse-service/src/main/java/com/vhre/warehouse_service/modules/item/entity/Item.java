package com.vhre.warehouse_service.modules.item.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.vhre.warehouse_service.core.base.entity.BaseEntity;
import com.vhre.warehouse_service.modules.warehouse.entity.Warehouse;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item extends BaseEntity {
    @Column(nullable = false, unique = true, length = 50)
    private String sku;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double price;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id", nullable = false)
    private Warehouse warehouse;
}
