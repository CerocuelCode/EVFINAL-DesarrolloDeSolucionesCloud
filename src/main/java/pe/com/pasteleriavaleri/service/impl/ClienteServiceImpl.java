package pe.com.pasteleriavaleri.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.pasteleriavaleri.entity.ClienteEntity;
import pe.com.pasteleriavaleri.repository.ClienteRepository;
import pe.com.pasteleriavaleri.service.ClienteService;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repositorio;

    @Override
    public List<ClienteEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public ClienteEntity findById(long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return repositorio.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objCliente = new ClienteEntity();
        BeanUtils.copyProperties(c, objCliente);
        return repositorio.save(objCliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objCliente = repositorio.findById(c.getCodigo()).get();
        objCliente.setEstado(false);
        return repositorio.save(objCliente);

    }
}
