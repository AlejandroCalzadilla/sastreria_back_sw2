package com.sw2.sastreria.sales.collections;

import com.sw2.sastreria.pruebas.collections.Store;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "inventory")
public class Inventory {

    @Id
    private String id;
    private int quantity;

    @DBRef
    private RawMaterial rawMaterial;

    @DBRef
    private Store store;
}
