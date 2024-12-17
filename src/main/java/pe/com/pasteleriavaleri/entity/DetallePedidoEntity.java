package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="DetallePedidoEntity")
@Table(name="detalle_pedido")
public class DetallePedidoEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="coddetallepedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name = "codpedido", nullable = false)
    private PedidoEntity pedido;
    @ManyToOne
    @JoinColumn(name = "codproducto", nullable = false)
    private ProductoEntity producto;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="precio_unitario")
    private double precioUnitario;
    @Column(name="subtotal")
    private double subtotal;
    @Column(name="especificaciones")
    private String especificaciones;


}
