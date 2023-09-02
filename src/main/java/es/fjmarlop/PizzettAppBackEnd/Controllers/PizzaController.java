package es.fjmarlop.PizzettAppBackEnd.Controllers;


import es.fjmarlop.PizzettAppBackEnd.Models.PizzaModel;
import es.fjmarlop.PizzettAppBackEnd.Services.PizzaService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
public class PizzaController {

    @Autowired
    private final PizzaService pizzaService;

    @GetMapping("/pizzas")
    public List<PizzaModel> getAllPizzas() {
        return pizzaService.getAllPizzas();
    }

}
