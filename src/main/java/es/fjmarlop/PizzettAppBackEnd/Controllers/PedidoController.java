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

    @PostMapping("/pedido")
    public ResponseEntity<?> insertarPedido(@RequestBody PedidoEntity pedido) {
        var order = pedidoService.guardarPedido(pedido);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/pedidos/{email}")
    public ResponseEntity<?> getAllPedidos(@PathVariable String email) {
        return ResponseEntity.of(Optional.of(pedidoService.getPedidos(email)));
    }

}
