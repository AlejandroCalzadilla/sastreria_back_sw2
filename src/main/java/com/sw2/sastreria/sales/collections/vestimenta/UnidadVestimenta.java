package com.sw2.sastreria.sales.collections.vestimenta;

import org.springframework.data.annotation.Id;

public record UnidadVestimenta(@Id String id, boolean estado, MedidaVestimenta medidaVestimenta) {
}
