package pe.com.pasteleriavaleri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriavaleri.entity.ProductoEntity;

import java.util.List;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

    @Query("select p from ProductoEntity p where p.estado=true")
    List<ProductoEntity> findAllCustom();
}
