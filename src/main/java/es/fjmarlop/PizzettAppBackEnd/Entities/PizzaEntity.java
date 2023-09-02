package es.fjmarlop.PizzettAppBackEnd.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String pizzaName;

    private String pizzaImg;

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = IngredientsEntity.class)
    @JoinTable(name = "Pizza_Ingrediente", joinColumns = @JoinColumn(name = "pizzaId"), inverseJoinColumns = @JoinColumn(name = "ingredienteId"))
    private Set<IngredientsEntity> ingredients;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "Pizza_TamanioPizza", joinColumns = @JoinColumn(name = "pizzaId"), inverseJoinColumns = @JoinColumn(name = "tamanioPizzaId"))
    private Set<TamanioPizzaEntity> tamanioPizza;
}
