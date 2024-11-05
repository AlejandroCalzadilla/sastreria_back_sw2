package com.sw2.sastreria.clothing.repositories;


import com.sw2.sastreria.clothing.collections.Vestimenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VestimentaRepository extends MongoRepository<Vestimenta, String> {
}
