package com.sw2.sastreria.purchases.repositories;

import com.sw2.sastreria.purchases.collections.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository <Inventory,String> {
}
