package es.fjmarlop.PizzettAppBackEnd.Entities;

import jakarta.persistence.*;
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
@Entity
@Table(name = "Productos")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;

    @NotNull
    private String nombre_producto;

    private String imagen_producto;

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = CategoriaEntity.class, cascade = CascadeType.ALL)
    @JoinTable(name = "Producto_Categoria",
            joinColumns = @JoinColumn(name = "productoID"),
            inverseJoinColumns = @JoinColumn(name = "categoriaID"))
    private Set<CategoriaEntity> categoria;

    private String descripcion;

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = IngredienteEntity.class)
    @JoinTable(name = "Producto_Ingrediente",
            joinColumns = @JoinColumn(name = "productoId"),
            inverseJoinColumns = @JoinColumn(name = "ingredienteId"))
    private Set<IngredienteEntity> ingredients;

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = TamanoEntity.class, cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    @JoinTable(name = "Producto_Tamano",
            joinColumns = @JoinColumn(name = "productoId"),
            inverseJoinColumns = @JoinColumn(name = "tamanoId"))
    private Set<TamanoEntity> tamanios;


}
