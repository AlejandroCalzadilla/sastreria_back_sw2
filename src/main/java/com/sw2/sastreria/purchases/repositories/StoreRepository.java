package com.sw2.sastreria.purchases.repositories;

import com.sw2.sastreria.purchases.collections.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String>{
}
