package es.fjmarlop.PizzettAppBackEnd.Controllers;

import es.fjmarlop.PizzettAppBackEnd.Entities.EmpleadoEntity;
import es.fjmarlop.PizzettAppBackEnd.Services.EmpleadoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/pizzettApp")
public class EmpleadoController {


    @Autowired
    private final EmpleadoService empleadoService;

    /**
     * Obtiene los detalles del empleado mediante su dirección de correo electrónico.
     *
     * @param email la dirección de correo electrónico del empleado
     * @return el ID del empleado si se encuentra, 0 en caso contrario
     */
    @GetMapping("/empleado/{email}")
    public int consultarEmpleado(@PathVariable String email) {
        if (email.isBlank() || email.isEmpty()) return 0;
        return empleadoService.consultarEmpleado(email);
    }

    /**
     * Obtiene todos los empleados.
     *
     * @return Entidad de respuesta que contiene todos los empleados
     */
    @GetMapping("/empleados")
    public ResponseEntity<?> getAllEmpleados() {
        return ResponseEntity.of(Optional.of(empleadoService.getEmpleados()));
    }

    /**
     * Inserta un empleado en el sistema.
     *
     * @param empleado el objeto EmpleadoEntity a insertar
     * @return un ResponseEntity que contiene el resultado de la operación
     */
    @PostMapping("/empleado")
    public EmpleadoEntity insertarEmpleado(@RequestBody EmpleadoEntity empleado) {
        return (empleadoService.guardarEmpleado(empleado));
    }

    /**
     * Elimina un empleado con el ID proporcionado.
     *
     * @param id el ID del empleado a eliminar
     */
    @DeleteMapping("/empleado/{id}")
    public void borrarEmpleado(@PathVariable long id) {
        empleadoService.borrarEmpleado(id);
    }
}
