package es.fjmarlop.PizzettAppBackEnd.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *  Clase que representa el modelo de datos del objeto linea de pedido.
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
public class LineaPedidoModel {
    private Long idLinea;
    private PedidoModel pedido;
    private ProductoModel producto;
}
