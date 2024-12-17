package pe.com.pasteleriavaleri.service;

import pe.com.pasteleriavaleri.entity.EmpleadoEntity;

import java.util.List;

public interface EmpleadoService {
    public List<EmpleadoEntity> findAll();

    public List<EmpleadoEntity> findAllCustom();

    public EmpleadoEntity findById(long id);

    public EmpleadoEntity add(EmpleadoEntity e);

    public EmpleadoEntity update(EmpleadoEntity e);

    public EmpleadoEntity delete(EmpleadoEntity e);
}
