package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad EmpleadoEntity que proporciona operaciones de base de datos.
 */
@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoEntity, Long> {


    /**
     * Valida la existencia de un empleado con el correo electrónico especificado.
     *
     * @param email Correo electrónico del empleado a consultar.
     * @return Número de empleados con el correo electrónico especificado.
     */
    @Query("SELECT COUNT(empleado) FROM EmpleadoEntity empleado WHERE empleado.empleadoEmail = ?1")
    int consultarEmpleado(String email);

}
