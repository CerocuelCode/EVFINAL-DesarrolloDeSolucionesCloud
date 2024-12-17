package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.DetallePedidoEntity;
import pe.com.pasteleriavaleri.repository.DetallePedidoRepository;
import pe.com.pasteleriavaleri.service.DetallePedidoService;

import java.util.List;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    @Autowired
    private DetallePedidoRepository repositorio;

    @Override
    public List<DetallePedidoEntity> findAll() {
        return repositorio.findAll();
    }


    @Override
    public DetallePedidoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public DetallePedidoEntity add(DetallePedidoEntity d) {
        return repositorio.save(d);
    }

    @Override
    public DetallePedidoEntity update(DetallePedidoEntity d) {
        DetallePedidoEntity objCompra = new DetallePedidoEntity();
        BeanUtils.copyProperties(d, objCompra);
        return repositorio.save(objCompra);
    }
}
