package com.sw2.sastreria.sales.repositories.vestimenta;


import com.sw2.sastreria.sales.collections.vestimenta.Vestimenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VestimentaRepository extends MongoRepository<Vestimenta, String> {
}
