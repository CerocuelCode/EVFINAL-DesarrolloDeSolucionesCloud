package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.CategoriaEntity;

import java.util.List;

public interface CategoriaService {
    public List<CategoriaEntity> findAll();

    public List<CategoriaEntity> findAllCustom();

    public CategoriaEntity findById(long id);

    public CategoriaEntity add(CategoriaEntity c);

    public CategoriaEntity update(CategoriaEntity c);

    public CategoriaEntity delete(CategoriaEntity c);
}
