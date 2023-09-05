package es.fjmarlop.PizzettAppBackEnd.Controllers;

import es.fjmarlop.PizzettAppBackEnd.Models.ProductoModel;
import es.fjmarlop.PizzettAppBackEnd.Services.ProductoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@AllArgsConstructor
public class ProductoController {

    @Autowired
    private final ProductoService productoService;


    @GetMapping("/productos")
    public List<ProductoModel> getAllProductos(){
        return productoService.getAllProductos();
    }
}
