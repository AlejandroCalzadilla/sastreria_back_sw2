package com.sw2.sastreria.clothing.collections;

import org.springframework.data.annotation.Id;

import java.util.Date;

public record Cambio(@Id String id, Date fecha, float nuevo_valor) {
}
