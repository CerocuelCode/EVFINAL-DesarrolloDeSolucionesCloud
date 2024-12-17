package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.DetallePedidoEntity;

import java.util.List;

public interface DetallePedidoService {
    public List<DetallePedidoEntity> findAll();

    public DetallePedidoEntity findById(long id);

    public DetallePedidoEntity add(DetallePedidoEntity d);

    public DetallePedidoEntity update(DetallePedidoEntity d);
}
