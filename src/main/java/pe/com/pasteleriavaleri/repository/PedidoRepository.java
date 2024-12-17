package pe.com.pasteleriavaleri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriavaleri.entity.PedidoEntity;

import java.util.List;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

    @Query("select p from PedidoEntity p where p.estado=true")
    List<PedidoEntity> findAllCustom();
}
