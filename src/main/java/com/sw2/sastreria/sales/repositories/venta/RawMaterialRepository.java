package com.sw2.sastreria.sales.repositories.venta;

import com.sw2.sastreria.sales.collections.venta.RawMaterial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RawMaterialRepository extends MongoRepository<RawMaterial,String> {
}
