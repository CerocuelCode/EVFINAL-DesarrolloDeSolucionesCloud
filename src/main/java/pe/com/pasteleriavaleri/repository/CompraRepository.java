package pe.com.pasteleriavaleri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriavaleri.entity.CompraEntity;

import java.util.List;

public interface CompraRepository extends JpaRepository<CompraEntity, Long> {
    @Query("select c from CompraEntity c where c.estado=true")
    List<CompraEntity> findAllCustom();
}
