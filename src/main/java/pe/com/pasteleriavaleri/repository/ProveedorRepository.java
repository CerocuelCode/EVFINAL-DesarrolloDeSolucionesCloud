package pe.com.pasteleriavaleri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.pasteleriavaleri.entity.ProveedorEntity;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<ProveedorEntity, Long> {

    @Query("select p from ProveedorEntity p where p.estado=true")
    List<ProveedorEntity> findAllCustom();
}
