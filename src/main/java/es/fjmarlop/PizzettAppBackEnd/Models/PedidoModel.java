package es.fjmarlop.PizzettAppBackEnd.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
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
