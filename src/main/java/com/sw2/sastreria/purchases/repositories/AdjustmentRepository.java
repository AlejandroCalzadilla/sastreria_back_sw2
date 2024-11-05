package com.sw2.sastreria.purchases.repositories;

import com.sw2.sastreria.purchases.collections.Adjustment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdjustmentRepository extends MongoRepository<Adjustment,String> {

}
