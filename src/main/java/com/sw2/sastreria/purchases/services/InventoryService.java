package com.sw2.sastreria.purchases.services;

import com.sw2.sastreria.purchases.collections.Inventory;
import com.sw2.sastreria.purchases.collections.RawMaterial;
import com.sw2.sastreria.purchases.collections.Store;
import com.sw2.sastreria.purchases.repositories.InventoryRepository;
import com.sw2.sastreria.purchases.repositories.RawMaterialRepository;
import com.sw2.sastreria.purchases.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    @Autowired
    private StoreRepository storeRepository;

    public List<Inventory> findAllInventories() {
        return inventoryRepository.findAll();
    }

    public Inventory findInventoryById(String id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public Inventory createInventory(int quantity, String rawMaterialId, String storeId) {
        Inventory inventory = new Inventory();
        inventory.setQuantity(quantity);

        Optional<RawMaterial> rawMaterial = rawMaterialRepository.findById(rawMaterialId);
        rawMaterial.ifPresent(inventory::setRawMaterial);

        Optional<Store> store = storeRepository.findById(storeId);
        store.ifPresent(inventory::setStore);

        return inventoryRepository.save(inventory);
    }

    public Inventory updateInventory(String id, int quantity, String rawMaterialId, String storeId) {
        Optional<Inventory> optionalInventory = inventoryRepository.findById(id);
        if (optionalInventory.isPresent()) {
            Inventory inventory = optionalInventory.get();
            inventory.setQuantity(quantity);

            Optional<RawMaterial> rawMaterial = rawMaterialRepository.findById(rawMaterialId);
            rawMaterial.ifPresent(inventory::setRawMaterial);

            Optional<Store> store = storeRepository.findById(storeId);
            store.ifPresent(inventory::setStore);

            return inventoryRepository.save(inventory);
        }
        return null;
    }

    public void deleteInventory(String id) {
        inventoryRepository.deleteById(id);
    }
}
