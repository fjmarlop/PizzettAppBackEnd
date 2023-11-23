package es.fjmarlop.PizzettAppBackEnd.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "LineaPedido")
public class LineaPedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLinea;

    private int cantidad;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = ProductoLineaEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "productoLinea_id", referencedColumnName = "id")
    private ProductoLineaEntity producto;
}
