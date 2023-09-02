package es.fjmarlop.PizzettAppBackEnd.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Pizza_TamanioPizza")
public class PizzaTamanioPizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pizzaId")
    private PizzaEntity pizza;

    @ManyToOne
    @JoinColumn(name = "tamanioPizzaId")
    private TamanioPizzaEntity tamanioPizza;

    @NotNull
    private Float precio;
}
