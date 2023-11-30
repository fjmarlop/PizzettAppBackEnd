package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.TamanoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad TamanoEntity que proporciona operaciones de base de datos.
 */
@Repository
public interface TamanoRepository extends CrudRepository<TamanoEntity, Long> {
}
