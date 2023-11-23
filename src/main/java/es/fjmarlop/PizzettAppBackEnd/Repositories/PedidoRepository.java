package es.fjmarlop.PizzettAppBackEnd.Repositories;

import es.fjmarlop.PizzettAppBackEnd.Entities.PedidoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoEntity, Long> {


    @Query("SELECT pedido, linea.cantidad, producto.categoria, producto.nombre_producto, producto.pvp, producto.tamano" +
            "  FROM PedidoEntity pedido JOIN LineaPedidoEntity linea ON linea.idLinea = pedido.idPedido  JOIN ProductoLineaEntity producto ON producto.id = linea.idLinea " +
            "WHERE pedido.emailCliente = ?1 ORDER BY pedido.idPedido DESC")
    List<PedidoEntity> getPedidos(String email);

}
