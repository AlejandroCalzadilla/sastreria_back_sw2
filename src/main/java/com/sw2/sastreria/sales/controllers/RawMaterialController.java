package com.sw2.sastreria.sales.controllers;

import com.sw2.sastreria.sales.repositories.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.sw2.sastreria.sales.collections.RawMaterial;
import java.util.List;


@Controller
public class RawMaterialController {

    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    @QueryMapping
    public List<RawMaterial> findAllRawMaterials() {
        return rawMaterialRepository.findAll();
    }


     /*
    @QueryMapping
    public RawMaterial findRawMaterialById(@Argument String id) {
        return rawMaterialRepository.findById(id).orElse(null);
    }
    ]
      */


    @MutationMapping
    public RawMaterial createRawMaterial(@Argument  String name,@Argument String unit) {
        RawMaterial rawMaterial = new RawMaterial();
        rawMaterial.setName(name);
        rawMaterial.setUnit(unit);
        return rawMaterialRepository.save(rawMaterial);
    }


}
