package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoEntity, Long> {


    @Query("SELECT COUNT(empleado) FROM EmpleadoEntity empleado WHERE empleado.empleadoEmail = ?1")
    int consultarEmpleado(String email);

}
