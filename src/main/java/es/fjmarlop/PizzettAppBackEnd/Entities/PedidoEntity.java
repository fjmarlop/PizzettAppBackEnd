package es.fjmarlop.PizzettAppBackEnd.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 *  Clase que representa un pedido.
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
