package com.sw2.sastreria.sales.repositories;

import com.sw2.sastreria.sales.collections.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
