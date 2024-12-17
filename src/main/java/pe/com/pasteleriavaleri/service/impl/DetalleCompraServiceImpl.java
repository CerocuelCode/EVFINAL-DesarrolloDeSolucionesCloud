package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.DetalleCompraEntity;
import pe.com.pasteleriavaleri.repository.DetalleCompraRepository;
import pe.com.pasteleriavaleri.service.DetalleCompraService;

import java.util.List;

@Service
public class DetalleCompraServiceImpl implements DetalleCompraService {

    @Autowired
    private DetalleCompraRepository repositorio;

    @Override
    public List<DetalleCompraEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public DetalleCompraEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public DetalleCompraEntity add(DetalleCompraEntity d) {
        return repositorio.save(d);
    }

    @Override
    public DetalleCompraEntity update(DetalleCompraEntity d) {
        DetalleCompraEntity objCompra = new DetalleCompraEntity();
        BeanUtils.copyProperties(d, objCompra);
        return repositorio.save(objCompra);
    }

}
