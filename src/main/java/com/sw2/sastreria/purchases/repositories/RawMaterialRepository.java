package com.sw2.sastreria.purchases.repositories;

import com.sw2.sastreria.purchases.collections.RawMaterial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RawMaterialRepository extends MongoRepository<RawMaterial,String> {
}
