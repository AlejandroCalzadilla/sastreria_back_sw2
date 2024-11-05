package com.sw2.sastreria.sales.validation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RawMaterialInput {
    @NotBlank(message = "Name is mandatory")
    @Size(min = 4, message = "Name must be at least 4 characters long")
    private String name;

    @NotBlank(message = "Unit is mandatory")
    @Size(min = 4, message = "Unit must be at least 4 characters long")
    private String unit;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
