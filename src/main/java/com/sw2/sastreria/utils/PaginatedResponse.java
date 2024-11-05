package com.sw2.sastreria.utils;

import java.util.List;

public class PaginatedResponse<T> {
    private List<T> items;
    private int total;

    public PaginatedResponse(List<T> items, int total) {
        this.items = items;
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public int getTotal() {
        return total;
    }
}
