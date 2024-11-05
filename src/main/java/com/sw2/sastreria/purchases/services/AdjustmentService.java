package com.sw2.sastreria.purchases.services;

import com.sw2.sastreria.purchases.collections.Adjustment;
import com.sw2.sastreria.purchases.repositories.AdjustmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdjustmentService {

    @Autowired
    private AdjustmentRepository adjustmentRepository;

    public List<Adjustment> findAllAdjustments() {
        return adjustmentRepository.findAll();
    }

    public Adjustment findAdjustmentById(String id) {
        return adjustmentRepository.findById(id).orElse(null);
    }

    public Adjustment createAdjustment(String date, String newValue) {
        Adjustment adjustment = new Adjustment();
        adjustment.setDate(date);
        adjustment.setNew_value(newValue);
        return adjustmentRepository.save(adjustment);
    }

    public Adjustment updateAdjustment(String id, String date, String newValue) {
        Optional<Adjustment> optionalAdjustment = adjustmentRepository.findById(id);
        if (optionalAdjustment.isPresent()) {
            Adjustment adjustment = optionalAdjustment.get();
            if (date != null) adjustment.setDate(date);
            if (newValue != null) adjustment.setNew_value(newValue);
            return adjustmentRepository.save(adjustment);
        }
        return null;
    }

    public void deleteAdjustment(String id) {
        adjustmentRepository.deleteById(id);
    }
}
