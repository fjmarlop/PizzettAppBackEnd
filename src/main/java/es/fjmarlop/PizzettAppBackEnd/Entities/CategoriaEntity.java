package es.fjmarlop.PizzettAppBackEnd.Entities;

import es.fjmarlop.PizzettAppBackEnd.Entities.enums.ECategoria;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Categorias")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private ECategoria nombre_categoria;

}
