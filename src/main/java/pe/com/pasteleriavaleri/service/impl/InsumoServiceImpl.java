package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.InsumoEntity;
import pe.com.pasteleriavaleri.repository.InsumoRepository;
import pe.com.pasteleriavaleri.service.InsumoService;

import java.util.List;

@Service
public class InsumoServiceImpl implements InsumoService {

    @Autowired
    private InsumoRepository repositorio;

    @Override
    public List<InsumoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<InsumoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public InsumoEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public InsumoEntity add(InsumoEntity i) {
        return repositorio.save(i);
    }

    @Override
    public InsumoEntity update(InsumoEntity i) {
        InsumoEntity objInsumo = new InsumoEntity();
        BeanUtils.copyProperties(i, objInsumo);
        return repositorio.save(objInsumo);
    }

    @Override
    public InsumoEntity delete(InsumoEntity i) {
        InsumoEntity objInsumo = repositorio.findById(i.getCodigo()).get();
        objInsumo.setEstado(false);
        return repositorio.save(objInsumo);

    }
}
