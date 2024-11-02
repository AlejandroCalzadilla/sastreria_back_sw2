package com.sw2.sastreria.sales.repositories;

import com.sw2.sastreria.sales.collections.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String>{
}
