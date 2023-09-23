package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.ProductoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Long> {


    @Query("SELECT producto FROM ProductoEntity producto JOIN producto.categoria categoria WHERE categoria.nombre_categoria = ?1")
    List<ProductoEntity> getAllProductosPorCategoria(String categoria);

    @Query("SELECT producto FROM ProductoEntity producto JOIN producto.categoria categoria WHERE categoria.nombre_categoria NOT IN ('Postres','Bebidas')")
    List<ProductoEntity> getProductosParaRecomendados();
}
