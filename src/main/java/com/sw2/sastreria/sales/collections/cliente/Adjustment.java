package com.sw2.sastreria.sales.collections.cliente;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "adjustment")
public class Adjustment {
    @Id
    private String id;
    private String date;
    private String new_value;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNew_value() {
        return new_value;
    }

    public void setNew_value(String new_value) {
        this.new_value = new_value;
    }



}
