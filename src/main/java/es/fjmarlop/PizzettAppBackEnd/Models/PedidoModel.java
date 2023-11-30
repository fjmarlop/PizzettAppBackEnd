package es.fjmarlop.PizzettAppBackEnd.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
/**
 *  Clase que representa el modelo de datos del objeto Pedido.
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
public class PedidoModel {
    private Long id;
    private String nombreCliente;
    private String emailCliente;
    private String telefonoCliente;
    private String direccionEnvio;
    private String fechaCreacion;
    private String fechaPedido;
    private Double total;
    private String estado;
    private String tipoEntrega;
    private List<LineaPedidoModel> lineasPedido;
}
