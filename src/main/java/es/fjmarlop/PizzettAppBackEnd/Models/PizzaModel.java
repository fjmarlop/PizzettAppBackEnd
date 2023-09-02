package es.fjmarlop.PizzettAppBackEnd.Models;

import es.fjmarlop.PizzettAppBackEnd.Entities.IngredientsEntity;
import es.fjmarlop.PizzettAppBackEnd.Entities.TamanioPizzaEntity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PizzaModel {

    @NotBlank
    private String pizzaName;

    private String pizzaImg;

    @NotBlank
    private Set<IngredientsEntity> ingredients;

    @NotBlank
    private Set<TamanioPizzaEntity> tamanioPizza;


}
