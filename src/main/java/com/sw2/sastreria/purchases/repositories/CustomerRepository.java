package com.sw2.sastreria.purchases.repositories;

import com.sw2.sastreria.purchases.collections.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
