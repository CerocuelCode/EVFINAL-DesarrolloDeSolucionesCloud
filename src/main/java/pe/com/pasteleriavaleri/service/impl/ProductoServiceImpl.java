package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.ProductoEntity;
import pe.com.pasteleriavaleri.repository.ProductoRepository;
import pe.com.pasteleriavaleri.service.ProductoService;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<ProductoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public ProductoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ProductoEntity add(ProductoEntity p) {
        return repositorio.save(p);
    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objProducto = new ProductoEntity();
        BeanUtils.copyProperties(p, objProducto);
        return repositorio.save(objProducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objProducto = repositorio.findById(p.getCodigo()).get();
        objProducto.setEstado(false);
        return repositorio.save(objProducto);

    }
}
