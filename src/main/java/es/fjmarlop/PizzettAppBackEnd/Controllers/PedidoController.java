package es.fjmarlop.PizzettAppBackEnd.Controllers;

import es.fjmarlop.PizzettAppBackEnd.Entities.PedidoEntity;
import es.fjmarlop.PizzettAppBackEnd.Services.PedidoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerException;
import java.util.Optional;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/pizzettApp")
public class PedidoController {

    @Autowired
    private final PedidoService pedidoService;

    /**
     * Inserta un nuevo pedido utilizando el PedidoEntity proporcionado.
     *
     * @param pedido el objeto PedidoEntity que contiene los detalles del pedido
     * @return el objeto ResponseEntity con el pedido guardado
     */
    @PostMapping("/pedido")
    public ResponseEntity<?> insertarPedido(@RequestBody PedidoEntity pedido) {
        var order = pedidoService.guardarPedido(pedido);
        return ResponseEntity.ok(order);
    }

    /**
     * Recupera todos los pedidos para un correo electrónico dado.
     *
     * @param email el correo electrónico del usuario
     * @return un Optional que contiene la lista de pedidos para el correo electrónico,
     * o un Optional vacío si no se encuentran pedidos
     */
    @GetMapping("/pedidos/{email}")
    public ResponseEntity<?> getAllPedidos(@PathVariable String email) {
        return ResponseEntity.of(Optional.of(pedidoService.getPedidos(email)));
    }

    /**
     * Obtiene todos los pedidos.
     *
     * @return ResponseEntity que contiene la lista de pedidos
     */
    @GetMapping("/allpedidos")
    public ResponseEntity<?> getAllPedidos() {
        return ResponseEntity.of(Optional.of(pedidoService.getAllPedidos()));
    }

    /**
     * Actualiza el estado del pedido con el id dado al estado especificado.
     *
     * @param id     el id del pedido a actualizar
     * @param estado el nuevo valor de estado para el pedido
     * @return un ResponseEntity que indica el éxito de la operación
     */
    @PutMapping("/actualizarEstado/{id}/{estado}")
    public ResponseEntity<?> cambiarEstado(@PathVariable Long id, @PathVariable String estado) {
        pedidoService.actualizarEstado(id, estado);
        return ResponseEntity.ok().build();
    }
}
