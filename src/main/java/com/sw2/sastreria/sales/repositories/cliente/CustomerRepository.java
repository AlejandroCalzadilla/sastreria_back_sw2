package com.sw2.sastreria.sales.repositories.cliente;

import com.sw2.sastreria.sales.collections.cliente.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
