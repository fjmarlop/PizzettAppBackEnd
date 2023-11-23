package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Entities.PedidoEntity;
import es.fjmarlop.PizzettAppBackEnd.Models.PedidoModel;
import es.fjmarlop.PizzettAppBackEnd.Repositories.PedidoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class PedidoService {

    @Autowired
    private final PedidoRepository pedidoRepository;
    @Autowired
    private final ModelMapper modelMapper;

    private PedidoModel toModel(PedidoEntity pedidoEntity) {
        return modelMapper.map(pedidoEntity, PedidoModel.class);
    }

    public PedidoEntity guardarPedido(PedidoEntity pedidoEntity) {
        return pedidoRepository.save(pedidoEntity);
    }

    public List<?> getPedidos(String email) {
        return pedidoRepository.getPedidos(email);
    }
}
