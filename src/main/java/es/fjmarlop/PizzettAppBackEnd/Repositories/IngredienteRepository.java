package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.IngredienteEntity;
import es.fjmarlop.PizzettAppBackEnd.Entities.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * Repositorio para la entidad IngedienteEntity que proporciona operaciones de base de datos.
 */
@Repository
public interface IngredienteRepository extends CrudRepository<IngredienteEntity, Long> {

}
