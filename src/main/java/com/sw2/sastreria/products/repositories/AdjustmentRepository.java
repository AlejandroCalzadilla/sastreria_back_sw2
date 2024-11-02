package com.sw2.sastreria.products.repositories;

import com.sw2.sastreria.products.collections.Adjustment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdjustmentRepository extends MongoRepository<Adjustment,String> {

}
