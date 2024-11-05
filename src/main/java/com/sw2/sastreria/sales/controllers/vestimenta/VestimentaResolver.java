package com.sw2.sastreria.sales.controllers.vestimenta;

import com.sw2.sastreria.sales.collections.vestimenta.Vestimenta;
import com.sw2.sastreria.sales.collections.vestimenta.Medida;
import com.sw2.sastreria.sales.collections.vestimenta.UnidadVestimenta;
import com.sw2.sastreria.sales.repositories.vestimenta.VestimentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VestimentaResolver {

  @Autowired
  private VestimentaRepository vestimentaRepository;

  @QueryMapping
  public List<Vestimenta> getAllVestimentas() {
    return vestimentaRepository.findAll();
  }

  @QueryMapping
  public Vestimenta getVestimentaById(@Argument String id) {
    return vestimentaRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Vestimenta no encontrada con ID: " + id));
  }

  @MutationMapping
  public Vestimenta createVestimenta(@Argument String nombre, @Argument String genero, @Argument UnidadVestimenta unidadVestimenta, @Argument Medida medida) {
    Vestimenta vestimenta = new Vestimenta(null, nombre, genero, unidadVestimenta, medida);
    return vestimentaRepository.save(vestimenta);
  }
}
