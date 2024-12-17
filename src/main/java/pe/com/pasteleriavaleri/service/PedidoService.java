package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.PedidoEntity;

import java.util.List;

public interface PedidoService {
    public List<PedidoEntity> findAll();

    public List<PedidoEntity> findAllCustom();

    public PedidoEntity findById(long id);

    public PedidoEntity add(PedidoEntity p);

    public PedidoEntity update(PedidoEntity p);

    public PedidoEntity delete(PedidoEntity p);
}
