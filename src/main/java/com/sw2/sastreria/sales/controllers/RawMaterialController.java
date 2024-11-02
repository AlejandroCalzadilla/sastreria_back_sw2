package com.sw2.sastreria.sales.controllers;

import com.sw2.sastreria.sales.repositories.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.sw2.sastreria.sales.collections.RawMaterial;
import java.util.List;
import java.util.Optional;


@Controller
public class RawMaterialController {

    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    @QueryMapping
    public List<RawMaterial> findAllRawMaterials() {
        return rawMaterialRepository.findAll();
    }

    @QueryMapping("/{id}")
    public Optional<RawMaterial> getRawMaterialById(@PathVariable String id) {
        return rawMaterialRepository.findById(id);
    }

    @MutationMapping
    public RawMaterial createRawMaterial(@Argument  String name,@Argument String unit) {
        RawMaterial rawMaterial = new RawMaterial();
        rawMaterial.setName(name);
        rawMaterial.setUnit(unit);
        return rawMaterialRepository.save(rawMaterial);
    }

    @PutMapping("/{id}")
    public RawMaterial updateRawMaterial(@PathVariable String id, @RequestBody RawMaterial rawMaterial) {
        rawMaterial.setId(id);
        return rawMaterialRepository.save(rawMaterial);
    }

    @DeleteMapping("/{id}")
    public void deleteRawMaterial(@PathVariable String id) {
        rawMaterialRepository.deleteById(id);
    }
}
