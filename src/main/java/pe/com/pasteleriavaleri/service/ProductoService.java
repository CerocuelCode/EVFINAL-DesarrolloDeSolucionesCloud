package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.ProductoEntity;

import java.util.List;

public interface ProductoService {
    public List<ProductoEntity> findAll();

    public List<ProductoEntity> findAllCustom();

    public ProductoEntity findById(long id);

    public ProductoEntity add(ProductoEntity p);

    public ProductoEntity update(ProductoEntity p);

    public ProductoEntity delete(ProductoEntity p);
}
