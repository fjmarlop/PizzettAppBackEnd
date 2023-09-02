package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Entities.PizzaEntity;
import es.fjmarlop.PizzettAppBackEnd.Models.PizzaModel;
import es.fjmarlop.PizzettAppBackEnd.Repositories.PizzaRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@AllArgsConstructor
public class PizzaService {

    @Autowired
    private final PizzaRepository pizzaRepository;

    @Autowired
    private final ModelMapper modelMapper;



    public List<PizzaModel> getAllPizzas(){
        List<PizzaEntity> pizzas = (List<PizzaEntity>) pizzaRepository.findAll();
        // Obtén la lista de tamaños de pizza directamente en la consulta
        List<PizzaModel> pizzaModels = pizzas.stream()
                .map(pizzaEntity -> modelMapper.map(pizzaEntity, PizzaModel.class))
                .collect(Collectors.toList());
        // Esto asegura que los tamaños de pizza se cargarán cuando se acceda a ellos
        // Evita la carga excesiva de datos (n+1)
        pizzaModels.forEach(pizzaModel -> pizzaModel.getTamanioPizza().size());

        return pizzaModels;
    }
}
