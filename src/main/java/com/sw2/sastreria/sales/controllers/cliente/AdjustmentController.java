package com.sw2.sastreria.sales.controllers.cliente;


import com.sw2.sastreria.sales.collections.cliente.Adjustment;
import com.sw2.sastreria.sales.services.AdjustmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AdjustmentController {


    @Autowired
    private AdjustmentService adjustmentService;

    @QueryMapping
    public List<Adjustment> findAllAdjustments() {
        return adjustmentService.findAllAdjustments();
    }

    @QueryMapping
    public Adjustment findAdjustmentById(@Argument String id) {
        return adjustmentService.findAdjustmentById(id);
    }

    @MutationMapping
    public Adjustment createAdjustment(@Argument String date, @Argument String newValue) {
        return adjustmentService.createAdjustment(date, newValue);
    }

    @MutationMapping
    public Adjustment updateAdjustment(@Argument String id, @Argument String date, @Argument String newValue) {
        return adjustmentService.updateAdjustment(id, date, newValue);
    }

    @MutationMapping
    public String deleteAdjustment(@Argument String id) {
        adjustmentService.deleteAdjustment(id);
        return "Adjustment deleted successfully";
    }
}
