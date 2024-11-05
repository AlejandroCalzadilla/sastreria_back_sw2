package com.sw2.sastreria.sales.repositories.cliente;

import com.sw2.sastreria.sales.collections.cliente.Adjustment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdjustmentRepository extends MongoRepository<Adjustment,String> {

}
