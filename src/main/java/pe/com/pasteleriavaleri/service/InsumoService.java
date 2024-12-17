package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.InsumoEntity;

import java.util.List;

public interface InsumoService {
    public List<InsumoEntity> findAll();

    public List<InsumoEntity> findAllCustom();

    public InsumoEntity findById(long id);

    public InsumoEntity add(InsumoEntity i);

    public InsumoEntity update(InsumoEntity i);

    public InsumoEntity delete(InsumoEntity i);
}
