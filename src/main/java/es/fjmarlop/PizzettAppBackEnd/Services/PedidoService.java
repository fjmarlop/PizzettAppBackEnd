package es.fjmarlop.PizzettAppBackEnd.Services;

import es.fjmarlop.PizzettAppBackEnd.Entities.PedidoEntity;
import es.fjmarlop.PizzettAppBackEnd.Models.PedidoModel;
import es.fjmarlop.PizzettAppBackEnd.Repositories.PedidoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Clase que representa el servicio de Pedidos.
 * Las anotaciones Lombock ayudan a tener el código mas limpio.
 * La anotación @Data nos implementa setters, getters, hasCode etc.
 * la anotación @AllArgsConstructor nos implementa los contructores con todos los atributos de la clase.
 */
@Service
@Data
@AllArgsConstructor
public class PedidoService {

    @Autowired
    private final PedidoRepository pedidoRepository;
    @Autowired
    private final ModelMapper modelMapper;

    /**
     * Convierte un objeto PedidoEntity a un objeto PedidoModel utilizando el modelMapper.
     *
     * @param pedidoEntity el objeto PedidoEntity a ser convertido
     * @return el objeto PedidoModel convertido
     */
    private PedidoModel toModel(PedidoEntity pedidoEntity) {
        return modelMapper.map(pedidoEntity, PedidoModel.class);
    }

    /**
     * Guarda el objeto `Pedido` proporcionado en la base de datos.
     *
     * @param pedidoEntity el objeto `PedidoEntity` a guardar
     * @return el objeto `PedidoEntity` guardado
     */
    public PedidoEntity guardarPedido(PedidoEntity pedidoEntity) {
        return pedidoRepository.save(pedidoEntity);
    }

    /**
     * Recupera una lista de pedidos para una dirección de correo electrónico.
     *
     * @param email la dirección de correo electrónico para la cual se recuperan los pedidos
     * @return una lista de pedidos asociados con la dirección de correo electrónico
     */
    public List<?> getPedidos(String email) {
        return pedidoRepository.getPedidos(email);
    }

    /**
     * Recupera todos los pedidos de la base de datos.
     *
     * @return una lista que contiene todos los pedidos
     */
    public List<PedidoEntity> getAllPedidos() {
        return (List<PedidoEntity>) pedidoRepository.findAll();
    }

    /**
     * Actualiza el estado de un pedido basado en el id y el estado proporcionados.
     *
     * @param id     el id del pedido a actualizar
     * @param estado el nuevo estado del pedido
     */
    public void actualizarEstado(Long id, String estado) {
        var pedido = pedidoRepository.findById(id).orElse(null);
        if (pedido != null) {
            pedido.setEstado(estado);
            pedidoRepository.save(pedido);
        }
    }
}
