package com.sw2.sastreria.sales.services.venta;

import com.sw2.sastreria.sales.collections.venta.RawMaterial;
import com.sw2.sastreria.utils.ValidationException;
import org.springframework.stereotype.Service;

@Service
public class RawMaterialService {
    public RawMaterial createRawMaterial(String name, String unit) {
        validateCreateRawMaterial(name, unit);
        RawMaterial rawMaterial = new RawMaterial();
        rawMaterial.setName(name);
        rawMaterial.setUnit(unit);
        return rawMaterial;
    }

    public void validateCreateRawMaterial(String name, String unit) {
        if (name == null || name.trim().isEmpty()) {
            throw new ValidationException("El nombre es obligatorio");
        }
        if (unit == null || unit.trim().isEmpty()) {
            throw new ValidationException("La unidad es obligatoria");
        }
    }
}
