package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.CompraEntity;

import java.util.List;

public interface CompraService {
    public List<CompraEntity> findAll();

    public List<CompraEntity> findAllCustom();

    public CompraEntity findById(long id);

    public CompraEntity add(CompraEntity c);

    public CompraEntity update(CompraEntity c);

    public CompraEntity delete(CompraEntity c);
}
