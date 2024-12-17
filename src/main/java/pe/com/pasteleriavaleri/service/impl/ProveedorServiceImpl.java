package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.ProveedorEntity;
import pe.com.pasteleriavaleri.repository.ProveedorRepository;
import pe.com.pasteleriavaleri.service.ProveedorService;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository repositorio;

    @Override
    public List<ProveedorEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ProveedorEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public ProveedorEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ProveedorEntity add(ProveedorEntity p) {
        return repositorio.save(p);
    }

    @Override
    public ProveedorEntity update(ProveedorEntity p) {
        ProveedorEntity objProveedor = new ProveedorEntity();
        BeanUtils.copyProperties(p, objProveedor);
        return repositorio.save(objProveedor);
    }

    @Override
    public ProveedorEntity delete(ProveedorEntity p) {
        ProveedorEntity objProveedor = repositorio.findById(p.getCodigo()).get();
        objProveedor.setEstado(false);
        return repositorio.save(objProveedor);

    }
}
