package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Entities.ProductoEntity;
import es.fjmarlop.PizzettAppBackEnd.Models.ProductoModel;
import es.fjmarlop.PizzettAppBackEnd.Repositories.ProductoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<ProductoModel> getAllProductos(){
        List<ProductoEntity> productos = (List<ProductoEntity>) productoRepository.findAll();

        // Mapeo de Entidad a modelo
        List<ProductoModel> productoModels = productos.stream()
                .map(it -> modelMapper.map(it, ProductoModel.class))
                .collect(Collectors.toList());

        return productoModels;
    }


}
