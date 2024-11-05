package com.sw2.sastreria.sales.repositories;

import com.sw2.sastreria.sales.collections.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository <Inventory,String> {
}
