package com.sw2.sastreria.clothing.collections;

import org.springframework.data.annotation.Id;

public record MedidaVestimenta(@Id String id, float valor, Cambio cambio) {
}
