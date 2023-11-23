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
@Table(name = "ProductoLinea")
public class ProductoLineaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int idProducto;

    private String nombre_producto;

    private String categoria;

    private String tamano;

    private Double pvp;

}
