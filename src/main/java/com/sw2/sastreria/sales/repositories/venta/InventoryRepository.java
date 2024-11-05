package com.sw2.sastreria.sales.repositories.venta;

import com.sw2.sastreria.sales.collections.venta.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository extends MongoRepository <Inventory,String> {
}
