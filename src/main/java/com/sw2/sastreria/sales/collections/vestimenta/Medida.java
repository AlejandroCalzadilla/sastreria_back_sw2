package com.sw2.sastreria.sales.collections.vestimenta;

import org.springframework.data.annotation.Id;

public record Medida(@Id String id, String nombre, MedidaVestimenta medidaVestimenta) {
}
