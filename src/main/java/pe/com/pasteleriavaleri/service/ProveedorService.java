package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.ProveedorEntity;

import java.util.List;

public interface ProveedorService {
    public List<ProveedorEntity> findAll();

    public List<ProveedorEntity> findAllCustom();

    public ProveedorEntity findById(long id);

    public ProveedorEntity add(ProveedorEntity p);

    public ProveedorEntity update(ProveedorEntity p);

    public ProveedorEntity delete(ProveedorEntity p);
}
