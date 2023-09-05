package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity, Long> {

}
