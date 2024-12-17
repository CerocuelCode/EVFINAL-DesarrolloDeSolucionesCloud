package pe.com.pasteleriavaleri.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.pasteleriavaleri.entity.PedidoEntity;
import pe.com.pasteleriavaleri.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoRestController {
    @Autowired
    private PedidoService servicio;

    @GetMapping
    public List<PedidoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<PedidoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public PedidoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public PedidoEntity add(@RequestBody PedidoEntity p) {
        return servicio.add(p);
    }

    @PutMapping("/{id}")
    public PedidoEntity update(@PathVariable long id, @RequestBody PedidoEntity p) {
        p.setCodigo(id);
        return servicio.update(p);
    }

    @DeleteMapping("/{id}")
    public PedidoEntity delete(@PathVariable long id) {
        PedidoEntity objPedido = new PedidoEntity();
        objPedido.setEstado(false);
        return servicio.delete(PedidoEntity.builder().codigo(id).build());
    }
}
