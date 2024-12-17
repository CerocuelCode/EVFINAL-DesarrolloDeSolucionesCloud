package pe.com.pasteleriavaleri.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.pasteleriavaleri.entity.ClienteEntity;
import pe.com.pasteleriavaleri.service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    @Autowired
    private ClienteService servicio;

    @GetMapping
    public List<ClienteEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public ClienteEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c) {
        return servicio.add(c);
    }

    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity c) {
        c.setCodigo(id);
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id) {
        ClienteEntity objCliente = new ClienteEntity();
        objCliente.setEstado(false);
        return servicio.delete(ClienteEntity.builder().codigo(id).build());
    }
}
