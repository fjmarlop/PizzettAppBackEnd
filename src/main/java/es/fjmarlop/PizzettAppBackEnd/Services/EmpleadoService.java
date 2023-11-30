package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Entities.EmpleadoEntity;
import es.fjmarlop.PizzettAppBackEnd.Repositories.EmpleadoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase que representa el servicio de Empleados.
 * Las anotaciones Lombock ayudan a tener el código mas limpio.
 * La anotación @Data nos implementa setters, getters, hasCode etc.
 * la anotación @AllArgsConstructor nos implementa los contructores con todos los atributos de la clase.
 */
@Data
@AllArgsConstructor
@Service
public class EmpleadoService {

    @Autowired
    private final EmpleadoRepository empleadoRepository;

    @Autowired
    private final ModelMapper modelMapper;

    /**
     * Consulta el empleado con el correo electrónico dado.
     *
     * @param email el correo electrónico del empleado a consultar
     * @return el ID del empleado si se encuentra, 0 en caso contrario
     */
    public int consultarEmpleado(String email) {
        if (email.isBlank() || email.isEmpty()) return 0;
        return empleadoRepository.consultarEmpleado(email);
    }

    /**
     * Obtiene la lista de empleados.
     *
     * @return la lista de empleados
     */
    public List<EmpleadoEntity> getEmpleados() {
        return (List<EmpleadoEntity>) empleadoRepository.findAll();
    }

    /**
     * Guarda una entidad de empleado.
     *
     * @param empleado la entidad de empleado a guardar
     * @return la entidad de empleado guardada
     */
    public EmpleadoEntity guardarEmpleado(EmpleadoEntity empleado) {
        return empleadoRepository.save(empleado);
    }

    /**
     * Borra un empleado por su ID.
     *
     * @param id el ID del empleado a borrar
     */
    public void borrarEmpleado(long id) {
        empleadoRepository.deleteById(id);
    }
}
