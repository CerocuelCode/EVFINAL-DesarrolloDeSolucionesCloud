package pe.com.pasteleriavaleri.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.pasteleriavaleri.entity.ProveedorEntity;
import pe.com.pasteleriavaleri.service.ProveedorService;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorRestController {
    @Autowired
    private ProveedorService servicio;

    @GetMapping
    public List<ProveedorEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<ProveedorEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public ProveedorEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public ProveedorEntity add(@RequestBody ProveedorEntity p) {
        return servicio.add(p);
    }

    @PutMapping("/{id}")
    public ProveedorEntity update(@PathVariable long id, @RequestBody ProveedorEntity p) {
        p.setCodigo(id);
        return servicio.update(p);
    }

    @DeleteMapping("/{id}")
    public ProveedorEntity delete(@PathVariable long id) {
        ProveedorEntity objProveedor = new ProveedorEntity();
        objProveedor.setEstado(false);
        return servicio.delete(ProveedorEntity.builder().codigo(id).build());
    }
}
