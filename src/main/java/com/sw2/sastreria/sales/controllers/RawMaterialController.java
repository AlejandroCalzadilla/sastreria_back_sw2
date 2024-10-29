package com.sw2.sastreria.sales.controllers;

import com.sw2.sastreria.sales.repositories.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class RawMaterialController {

    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    @GetMapping
    public List<com.sw2.sastreria.sales.collections.RawMaterial> getAllRawMaterials() {
        return rawMaterialRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<com.sw2.sastreria.sales.collections.RawMaterial> getRawMaterialById(@PathVariable String id) {
        return rawMaterialRepository.findById(id);
    }

    @PostMapping
    public com.sw2.sastreria.sales.collections.RawMaterial createRawMaterial(@RequestBody com.sw2.sastreria.sales.collections.RawMaterial rawMaterial) {
        return rawMaterialRepository.save(rawMaterial);
    }

    @PutMapping("/{id}")
    public com.sw2.sastreria.sales.collections.RawMaterial updateRawMaterial(@PathVariable String id, @RequestBody com.sw2.sastreria.sales.collections.RawMaterial rawMaterial) {
        rawMaterial.setId(id);
        return rawMaterialRepository.save(rawMaterial);
    }

    @DeleteMapping("/{id}")
    public void deleteRawMaterial(@PathVariable String id) {
        rawMaterialRepository.deleteById(id);
    }
}
