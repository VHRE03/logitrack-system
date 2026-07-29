package com.vhre.warehouse_service.modules.warehouse.dto;

import com.vhre.warehouse_service.core.base.dto.BaseDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Data Transfer Object representing a physical Warehouse")
public class WarehouseDTO extends BaseDTO {
    @Schema(description = "Name of the warehouse", example = "Central Warehouse Norte")
    @NotBlank(message = "The warehouse name is mandatory")
    @Size(min = 3, max = 100, message = "The name must be between 3 and 100 characters")
    private String name;

    @Schema(description = "Physical location or city", example = "New York, NY")
    @NotBlank(message = "The location is mandatory")
    private String location;

    @Schema(description = "Maximum storage capacity (number of pallets/units)", example = "5000")
    @NotNull(message = "The capacity is mandatory")
    @Min(value = 1, message = "The capacity must be at least 1")
    private Integer capacity;
}
