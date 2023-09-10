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
