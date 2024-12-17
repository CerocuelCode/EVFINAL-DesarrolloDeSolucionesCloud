package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.PedidoEntity;
import pe.com.pasteleriavaleri.repository.PedidoRepository;
import pe.com.pasteleriavaleri.service.PedidoService;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository repositorio;

    @Override
    public List<PedidoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<PedidoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public PedidoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public PedidoEntity add(PedidoEntity p) {
        return repositorio.save(p);
    }

    @Override
    public PedidoEntity update(PedidoEntity p) {
        PedidoEntity objPedido = new PedidoEntity();
        BeanUtils.copyProperties(p, objPedido);
        return repositorio.save(objPedido);
    }

    @Override
    public PedidoEntity delete(PedidoEntity p) {
        PedidoEntity objPedido = repositorio.findById(p.getCodigo()).get();
        objPedido.setEstado(false);
        return repositorio.save(objPedido);

    }
}
