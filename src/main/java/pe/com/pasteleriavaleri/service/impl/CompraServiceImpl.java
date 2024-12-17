package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.CompraEntity;
import pe.com.pasteleriavaleri.repository.CompraRepository;
import pe.com.pasteleriavaleri.service.CompraService;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository repositorio;

    @Override
    public List<CompraEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<CompraEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public CompraEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public CompraEntity add(CompraEntity c) {
        return repositorio.save(c);
    }

    @Override
    public CompraEntity update(CompraEntity c) {
        CompraEntity objCompra = new CompraEntity();
        BeanUtils.copyProperties(c, objCompra);
        return repositorio.save(objCompra);
    }

    @Override
    public CompraEntity delete(CompraEntity c) {
        CompraEntity objCompra = repositorio.findById(c.getCodigo()).get();
        objCompra.setEstado(false);
        return repositorio.save(objCompra);

    }
}
