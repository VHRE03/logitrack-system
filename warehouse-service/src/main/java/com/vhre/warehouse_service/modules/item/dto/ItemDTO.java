package com.vhre.warehouse_service.modules.item.dto;

import com.vhre.warehouse_service.core.base.dto.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Data Transfer Object representing a cargo Item")
public class ItemDTO extends BaseDTO {
    @Schema(description = "Stock Keeping Unit (Unique Identifier)", example = "PAL-IND-001")
    @NotBlank(message = "The SKU is mandatory")
    private String sku;

    @Schema(description = "Name of the product/cargo", example = "Industrial Cargo Pallet")
    @NotBlank(message = "The item name is mandatory")
    private String name;

    @Schema(description = "Quantity available in stock", example = "150")
    @NotNull(message = "The quantity is mandatory")
    @Min(value = 0, message = "The quantity cannot be negative")
    private Integer quantity;

    @Schema(description = "Unit price of the item", example = "250.50")
    @NotNull(message = "The price is mandatory")
    @DecimalMin(value = "0.0", inclusive = false, message = "The price must be greater than zero")
    private Double price;

    @Schema(description = "ID of the warehouse where this item is stored", example = "123e4567-e89b-12d3-a456-426614174000")
    @NotNull(message = "The warehouse ID is mandatory")
    private UUID warehouseId;
}
