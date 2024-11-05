package com.sw2.sastreria.sales.collections.venta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rawmaterial")
public class RawMaterial {


    @Id
    private String id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 4, message = "Name must be at least 4 characters long")
    @Indexed(unique = true) // Crea un índice único en la base de datos
    private String name;

    @NotBlank(message = "Unit is mandatory")
    @Size(min = 4, message = "Unit must be at least 4 characters long")
    private String unit;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

