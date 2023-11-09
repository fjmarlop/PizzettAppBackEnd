package es.fjmarlop.PizzettAppBackEnd.Controllers;

import es.fjmarlop.PizzettAppBackEnd.Services.EmpleadoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@AllArgsConstructor
@RequestMapping("/pizzettApp")
public class EmpleadoController {


    @Autowired
    private final EmpleadoService empleadoService;

    @GetMapping("/empleado/{email}")
    public int consultarEmpleado(@PathVariable String email) {
        if (email.isBlank() || email.isEmpty()) return 0;
        return empleadoService.consultarEmpleado(email);
    }
}
