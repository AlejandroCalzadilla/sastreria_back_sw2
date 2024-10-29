package com.sw2.sastreria.pruebas;

import com.sw2.sastreria.pruebas.collections.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, String>{
}
