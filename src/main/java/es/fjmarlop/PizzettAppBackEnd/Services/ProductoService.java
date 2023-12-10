package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Entities.IngredienteEntity;
import es.fjmarlop.PizzettAppBackEnd.Entities.ProductoEntity;
import es.fjmarlop.PizzettAppBackEnd.Entities.TamanoEntity;
import es.fjmarlop.PizzettAppBackEnd.Models.ProductoModel;
import es.fjmarlop.PizzettAppBackEnd.Repositories.IngredienteRepository;
import es.fjmarlop.PizzettAppBackEnd.Repositories.ProductoRepository;
import es.fjmarlop.PizzettAppBackEnd.Repositories.TamanoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/**
 * Clase que representa el servicio de Productos.
 * Las anotaciones Lombock ayudan a tener el código mas limpio.
 * La anotación @Data nos implementa setters, getters, hasCode etc.
 * la anotación @AllArgsConstructor nos implementa los contructores con todos los atributos de la clase.
 */
@Service
@Data
@AllArgsConstructor
public class ProductoService {

    @Autowired
    private final ProductoRepository productoRepository;

    @Autowired
    private final IngredienteRepository ingredienteRepository;
    @Autowired
    private final TamanoRepository tamanoRepository;

    @Autowired
    private final ModelMapper modelMapper;

    /**
     *  ModelMapper hace el mapeo de la clase entidad que trabaja
     *  con la base de datos a la clase modelo con la que
     *  trabajaremos habitualmente.
     *
     * @return List<ProductoModel>
     * @param productos List<ProductoEntity>
     *
     * */
    private List<ProductoModel> Mapper(List<ProductoEntity> productos) {
        return productos.stream()
                .map(it -> modelMapper.map(it, ProductoModel.class))
                .collect(Collectors.toList());
    }

    /**
     * Método que conecta con el repositorio para
     * conseguir todos los productos de la base de datos
     *
     * @return List<ProductoModel> (Lista de productos)
     * */
    public List<ProductoModel> getAllProductos() {
        List<ProductoEntity> productos = (List<ProductoEntity>) productoRepository.findAll();
        return Mapper(productos);
    }

    /**
     * Recupera todos los productos para una categoría dada.
     *
     * @param  categoria  la categoría para la cual recuperar los productos
     * @return            una lista de modelos de productos para la categoría dada
     */
    public List<ProductoModel> getAllProductosPorCategoria(String categoria) {
        List<ProductoEntity> productos = productoRepository.getAllProductosPorCategoria(categoria);
        return Mapper(productos);
    }

    /**
     * Obtiene la lista de objetos ProductoModel para ser utilizados en las recomendaciones.
     *
     * @return  La lista de objetos ProductoModel.
     */
    public List<ProductoModel> getProductosParaRecomendados(){
        List<ProductoEntity> productos = productoRepository.getProductosParaRecomendados();
        return Mapper(productos);
    }

    // AL ESTAR RELACIONADOS VOY A TRATAR LOS INGREDIENTES DESDE AQUÍ,
    // PARA FUTURAS VERSIONES SACAR DE ESTA CLASE PARA OFRECER UN CRUD DE INGREDIENTES.
    /**
     * Obtiene todos los ingredientes.
     *
     * @return  una lista de objetos IngredienteEntity que representan todos los ingredientes
     */
    public List<IngredienteEntity> getAllIngredientes() {
        return (List<IngredienteEntity>) ingredienteRepository.findAll();
    }
    /**
     * Recupera todos los objetos TamanoEntity de la base de datos.
     *
     * @return  una lista de objetos TamanoEntity
     */
    public List<TamanoEntity> getAllTamanos(){
        return (List<TamanoEntity>) tamanoRepository.findAll();
    }


    public ProductoEntity addProducto(ProductoEntity producto) {
       return productoRepository.save(producto);
    }

    public ProductoEntity borrarProducto(Long id){
        Optional<ProductoEntity> producto = this.productoRepository.findById(id);
        if(producto.isPresent()){
            this.productoRepository.deleteById(id);
            return producto.get();
        }
        return null;
    }
}
