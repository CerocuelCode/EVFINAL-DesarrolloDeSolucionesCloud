package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.CategoriaEntity;
import pe.com.pasteleriavaleri.repository.CategoriaRepository;
import pe.com.pasteleriavaleri.service.CategoriaService;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;

    @Override
    public List<CategoriaEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public CategoriaEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return repositorio.save(c);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objCategoria = new CategoriaEntity();
        BeanUtils.copyProperties(c, objCategoria);
        return repositorio.save(objCategoria);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objCategoria = repositorio.findById(c.getCodigo()).get();
        objCategoria.setEstado(false);
        return repositorio.save(objCategoria);

    }
}
