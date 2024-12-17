package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.DetalleCompraEntity;

import java.util.List;

public interface DetalleCompraService {
    public List<DetalleCompraEntity> findAll();

    public DetalleCompraEntity findById(long id);

    public DetalleCompraEntity add(DetalleCompraEntity d);

    public DetalleCompraEntity update(DetalleCompraEntity d);
}
