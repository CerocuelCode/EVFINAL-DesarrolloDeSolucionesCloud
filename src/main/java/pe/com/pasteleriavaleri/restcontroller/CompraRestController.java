package pe.com.pasteleriavaleri.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.pasteleriavaleri.entity.CompraEntity;
import pe.com.pasteleriavaleri.service.CompraService;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class CompraRestController {
    @Autowired
    private CompraService servicio;

    @GetMapping
    public List<CompraEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<CompraEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public CompraEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public CompraEntity add(@RequestBody CompraEntity c) {
        return servicio.add(c);
    }

    @PutMapping("/{id}")
    public CompraEntity update(@PathVariable long id, @RequestBody CompraEntity c) {
        c.setCodigo(id);
        return servicio.update(c);
    }

    @DeleteMapping("/{id}")
    public CompraEntity delete(@PathVariable long id) {
        CompraEntity objCompra = new CompraEntity();
        objCompra.setEstado(false);
        return servicio.delete(CompraEntity.builder().codigo(id).build());
    }
}
