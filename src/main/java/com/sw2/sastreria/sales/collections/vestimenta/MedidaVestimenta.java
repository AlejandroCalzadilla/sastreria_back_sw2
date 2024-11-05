package com.sw2.sastreria.sales.collections.vestimenta;

import org.springframework.data.annotation.Id;

public record MedidaVestimenta(@Id String id, float valor, Cambio cambio) {
}
