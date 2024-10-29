package com.sw2.sastreria.sales.repositories;

import com.sw2.sastreria.sales.collections.RawMaterial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RawMaterialRepository extends MongoRepository<RawMaterial,String> {
}
