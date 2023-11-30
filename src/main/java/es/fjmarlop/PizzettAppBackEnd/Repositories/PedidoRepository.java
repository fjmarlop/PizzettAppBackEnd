package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.PedidoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para la entidad PedidoEntity que proporciona operaciones de base de datos.
 */
@Repository
public interface PedidoRepository extends CrudRepository<PedidoEntity, Long> {

    /**
     * Recupera una lista de objetos PedidoEntity basados en el correo electrónico proporcionado.
     *
     * @param  email  el correo electrónico del cliente
     * @return        una lista de objetos PedidoEntity
     */
    @Query("SELECT pedido, linea.cantidad, producto.categoria, producto.nombre_producto, producto.pvp, producto.tamano" +
            "  FROM PedidoEntity pedido JOIN LineaPedidoEntity linea ON linea.idLinea = pedido.idPedido  JOIN ProductoLineaEntity producto ON producto.id = linea.idLinea " +
            "WHERE pedido.emailCliente = ?1 ORDER BY pedido.idPedido DESC")
    List<PedidoEntity> getPedidos(String email);

}

