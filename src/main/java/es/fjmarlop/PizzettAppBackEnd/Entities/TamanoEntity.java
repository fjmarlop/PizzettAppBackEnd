package es.fjmarlop.PizzettAppBackEnd.Entities;

import es.fjmarlop.PizzettAppBackEnd.Entities.enums.ETamano;
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
