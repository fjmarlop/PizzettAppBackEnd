package es.fjmarlop.PizzettAppBackEnd.Models;

import es.fjmarlop.PizzettAppBackEnd.Entities.CategoriaEntity;
import es.fjmarlop.PizzettAppBackEnd.Entities.IngredienteEntity;
import es.fjmarlop.PizzettAppBackEnd.Entities.TamanoEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;

/**
 *  Clase que representa el modelo de datos del objeto Producto.
 *  Las anotaciones Lombock ayudan a tener el código mas limpio.
 *  La anotación @Data nos implementa setters, getters, hasCode etc.
 *  La anotación @Builder nos permite construir objetos de la clase.
 *  La anotación @NoArgsConstructor nos implementa el constructor vacío de la clase.
 *  la anotación @AllArgsConstructor nos implementa los contructores con todos los atributos de la clase.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoModel {

    private Long id_producto;

    private String nombre_producto;

    private String imagen_producto;

    private Set<CategoriaEntity> categoria;

    private String descripcion;

    private Set<IngredienteEntity> ingredients;

    private Set<TamanoEntity> tamanios;

}
