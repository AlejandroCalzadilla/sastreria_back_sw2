package com.sw2.sastreria.sales.collections;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "notes")
public class Note {
    @Id
    private String id;
    private String fecha;
    private String tipo;
    private Float montoTotal;

    @DBRef
    private List<DetailNote> detailNotes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public List<DetailNote> getDetailNotes() {
        return detailNotes;
    }

    public void setDetailNotes(List<DetailNote> detailNotes) {
        this.detailNotes = detailNotes;
    }

    // Getters and Setters
}