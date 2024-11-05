package com.sw2.sastreria.sales.repositories.venta;

import com.sw2.sastreria.sales.collections.venta.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String>{
}
