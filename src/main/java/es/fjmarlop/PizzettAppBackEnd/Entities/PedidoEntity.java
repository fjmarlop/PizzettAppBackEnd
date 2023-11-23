package es.fjmarlop.PizzettAppBackEnd.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Pedidos")
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @NotNull
    private String nombreCliente;

    @NotNull
    private String emailCliente;

    private String telefonoCliente;

    private String direccionEnvio;

    @NotNull
    private String fechaCreacion;

    @NotNull
    private String fechaPedido;

    @NotNull
    private Double total;

    @NotNull
    private String estado;

    @NotNull
    private String tipoEntrega;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = LineaPedidoEntity.class)
    @JoinTable(name = "entreLineas", joinColumns = @JoinColumn(name = "pedidoId"), inverseJoinColumns = @JoinColumn(name = "lineaId"))
    private List<LineaPedidoEntity> lineasPedido;

}
