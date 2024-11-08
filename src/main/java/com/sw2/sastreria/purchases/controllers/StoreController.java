package com.sw2.sastreria.purchases.controllers;

import com.sw2.sastreria.purchases.repositories.StoreRepository;
import com.sw2.sastreria.purchases.collections.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class StoreController {


    @Autowired
    private StoreRepository storeRepository;

    // Query para obtener un Almacen por su ID
    @QueryMapping
    public Store findStoreById(@Argument  String id) {
        Store store = storeRepository.findById(id).orElse(null);
        return store;
    }



    // Query para obtener todos los Almacenes
    @QueryMapping
    public List<Store> findAllStore() {
        return storeRepository.findAll();
    }

    // Mutation para crear un nuevo Almacen
    @MutationMapping
    public Store createStore(@Argument String name, @Argument String address) {
        Store almacen = new Store();
        almacen.setName(name);
        almacen.setAddress(address);
        return storeRepository.save(almacen);
    }




    // Mutation para actualizar un Almacen existente
    @MutationMapping
    public Store updateStore(@Argument String id, @Argument String name, @Argument String address) {
        Optional<Store> optionalAlmacen = storeRepository.findById(id);
        if (optionalAlmacen.isPresent()) {
            Store almacen = optionalAlmacen.get();
            if (name != null) almacen.setName(name);
            if (address != null) almacen.setAddress(address);
            return storeRepository.save(almacen);
        }
        return null;
    }



    // Mutation para eliminar un Almacen
    @MutationMapping
    public String deleteStore(@Argument String id) {
        storeRepository.deleteById(id);
        return "Almacen eliminado con éxito";
    }

}
