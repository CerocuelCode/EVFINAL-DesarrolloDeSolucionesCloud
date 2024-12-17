package pe.com.pasteleriavaleri.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.pasteleriavaleri.entity.InsumoEntity;
import pe.com.pasteleriavaleri.service.InsumoService;

import java.util.List;

@RestController
@RequestMapping("/insumo")
public class InsumoRestController {
    @Autowired
    private InsumoService servicio;

    @GetMapping
    public List<InsumoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<InsumoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public InsumoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public InsumoEntity add(@RequestBody InsumoEntity i) {
        return servicio.add(i);
    }

    @PutMapping("/{id}")
    public InsumoEntity update(@PathVariable long id, @RequestBody InsumoEntity i) {
        i.setCodigo(id);
        return servicio.update(i);
    }

    @DeleteMapping("/{id}")
    public InsumoEntity delete(@PathVariable long id) {
        InsumoEntity objInsumo = new InsumoEntity();
        objInsumo.setEstado(false);
        return servicio.delete(InsumoEntity.builder().codigo(id).build());
    }
}
