package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.ProductoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para la entidad ProductoEntity que proporciona operaciones de base de datos.
 */
@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Long> {

    /**
     * Recupera todos los productos que pertenecen a una categoría específica.
     *
     * @param categoria el nombre de la categoría
     * @return una lista de objetos ProductoEntity
     */
    @Query("SELECT producto FROM ProductoEntity producto JOIN producto.categoria categoria WHERE categoria.nombre_categoria = ?1")
    List<ProductoEntity> getAllProductosPorCategoria(String categoria);

    /**
     * Recupera una lista de objetos ProductoEntity para productos recomendados.
     *
     * @return una lista de objetos ProductoEntity
     */
    @Query("SELECT producto FROM ProductoEntity producto JOIN producto.categoria categoria WHERE categoria.nombre_categoria NOT IN ('Postres','Bebidas')")
    List<ProductoEntity> getProductosParaRecomendados();
}
