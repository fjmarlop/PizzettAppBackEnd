package es.fjmarlop.PizzettAppBackEnd.Controllers;

import es.fjmarlop.PizzettAppBackEnd.Models.ProductoModel;
import es.fjmarlop.PizzettAppBackEnd.Services.ProductoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author Fco Javier Marmolejo López
 */

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/pizzettApp")
public class ProductoController {

    @Autowired
    private final ProductoService productoService;

    /**
     * EndPoint para conseguir todos los
     * productos de la base de datos filtrado por categorias
     *
     * @return ResponseEntity<?>
     * Cuándo el listado esté vacío, retorna 404 not found.
     */
    @GetMapping("/{cat}")
    public ResponseEntity<?> getAllProductosByCategoria(@PathVariable String cat) {
        List<ProductoModel> list = productoService.getAllProductosPorCategoria(cat);
        return (list.isEmpty()) ? ResponseEntity.notFound().build() : ResponseEntity.of(Optional.of(list));
    }

    /**
     * Obtiene todos los productos.
     *
     * @return ResponseEntity que contiene todos los productos
     */
    @GetMapping("/productos")
    public ResponseEntity<?> getAllProductos() {
        return ResponseEntity.of(Optional.of(productoService.getAllProductos()));
    }

    /**
     * Recupera los productos recomendados.
     *
     * @return un ResponseEntity que contiene los productos recomendados
     */
    @GetMapping("/recomendados")
    public ResponseEntity<?> getProductosParaRecomendados() {
        return ResponseEntity.of(Optional.of(productoService.getProductosParaRecomendados()));
    }

    // AL ESTAR RELACIONADOS VOY A TRATAR LOS INGREDIENTES DESDE AQUÍ,
    // PARA FUTURAS VERSIONES SACAR DE ESTA CLASE PARA OFRECER UN CRUD DE INGREDIENTES.

    /**
     * Obtiene todos los ingredientes.
     *
     * @return ResponseEntity que contiene la lista de ingredientes
     */
    @GetMapping("/ingredientes")
    public ResponseEntity<?> getAllIngredientes() {
        return ResponseEntity.of(Optional.of(productoService.getAllIngredientes()));
    }

    /**
     * Recupera todos los tamaños.
     *
     * @return una entidad de respuesta que contiene todos los tamaños
     */
    @GetMapping("/tamanos")
    public ResponseEntity<?> getAllTamanos() {
        return ResponseEntity.of(Optional.of(productoService.getAllTamanos()));
    }
}
