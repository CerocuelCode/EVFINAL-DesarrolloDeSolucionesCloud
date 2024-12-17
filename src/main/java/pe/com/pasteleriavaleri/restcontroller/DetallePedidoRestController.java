package pe.com.pasteleriavaleri.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.pasteleriavaleri.entity.DetallePedidoEntity;
import pe.com.pasteleriavaleri.service.DetallePedidoService;

import java.util.List;

@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoRestController {
    @Autowired
    private DetallePedidoService servicio;

    @GetMapping
    public List<DetallePedidoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public DetallePedidoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DetallePedidoEntity add(@RequestBody DetallePedidoEntity d) {
        return servicio.add(d);
    }

    @PutMapping("/{id}")
    public DetallePedidoEntity update(@PathVariable long id, @RequestBody DetallePedidoEntity d) {
        d.setCodigo(id);
        return servicio.update(d);
    }

}
