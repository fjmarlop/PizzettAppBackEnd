package es.fjmarlop.PizzettAppBackEnd.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LineaPedidoModel {
    private Long idLinea;
    private PedidoModel pedido;
    private ProductoModel producto;
}
