package pe.com.pasteleriavaleri.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.pasteleriavaleri.entity.DetalleCompraEntity;
import pe.com.pasteleriavaleri.service.DetalleCompraService;

import java.util.List;

@RestController
@RequestMapping("/detallecompra")
public class DetalleCompraRestController {
    @Autowired
    private DetalleCompraService servicio;

    @GetMapping
    public List<DetalleCompraEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public DetalleCompraEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DetalleCompraEntity add(@RequestBody DetalleCompraEntity d) {
        return servicio.add(d);
    }

    @PutMapping("/{id}")
    public DetalleCompraEntity update(@PathVariable long id, @RequestBody DetalleCompraEntity d) {
        d.setCodigo(id);
        return servicio.update(d);
    }

}
