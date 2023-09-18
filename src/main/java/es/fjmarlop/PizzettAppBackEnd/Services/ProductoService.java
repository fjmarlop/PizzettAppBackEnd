package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Entities.ProductoEntity;
import es.fjmarlop.PizzettAppBackEnd.Models.ProductoModel;
import es.fjmarlop.PizzettAppBackEnd.Repositories.ProductoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
@AllArgsConstructor
public class ProductoService {

    @Autowired
    private final ProductoRepository productoRepository;

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


    public List<ProductoModel> getAllProductosPorCategoria(String categoria) {
        List<ProductoEntity> productos = productoRepository.getAllProductosPorCategoria(categoria);
        return Mapper(productos);
    }

}
