package com.sw2.sastreria.sales.controllers;


import com.sw2.sastreria.sales.collections.Adjustment;
import com.sw2.sastreria.sales.repositories.AdjustmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/adjustments")
public class AdjustmentController {

    @Autowired
    private AdjustmentRepository adjustmentRepository;

    @GetMapping
    public List<Adjustment> getAllAdjustments() {
        return adjustmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Adjustment> getAdjustmentById(@PathVariable String id) {
        return adjustmentRepository.findById(id);
    }

    @PostMapping
    public Adjustment createAdjustment(@RequestBody Adjustment adjustment) {
        return adjustmentRepository.save(adjustment);
    }

    @PutMapping("/{id}")
    public Adjustment updateAdjustment(@PathVariable String id, @RequestBody Adjustment adjustment) {
        adjustment.setId(id);
        return adjustmentRepository.save(adjustment);
    }

    @DeleteMapping("/{id}")
    public void deleteAdjustment(@PathVariable String id) {
        adjustmentRepository.deleteById(id);
    }
}
