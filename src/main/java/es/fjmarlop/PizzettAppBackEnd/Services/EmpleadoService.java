package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Repositories.EmpleadoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Data
@AllArgsConstructor
@Service
public class EmpleadoService {

    @Autowired
    private final EmpleadoRepository empleadoRepository;

    @Autowired
    private final ModelMapper modelMapper;

    public int consultarEmpleado(String email){
       if (email.isBlank() || email.isEmpty()) return 0;
       return empleadoRepository.consultarEmpleado(email);
    }
}
