package es.fjmarlop.PizzettAppBackEnd.Entities;

import es.fjmarlop.PizzettAppBackEnd.Entities.enums.ETamano;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *  Clase que representa un tamaño.
 *  La anotación @Entity indica que será una entidad en nuestra base de datos.
 *  la anotación @Table  indica el nombre de la tabla que recibirá en la base de datos.
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
@Entity
@Table(name = "Tamano")
public class TamanoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private ETamano tamano;

    private Double pvp;

}
