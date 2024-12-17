package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="DetalleCompraEntity")
@Table(name="detalle_compra")
public class DetalleCompraEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="coddetallecompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @ManyToOne
    @JoinColumn(name = "codcompra", nullable = false)
    private CompraEntity compra;
    @ManyToOne
    @JoinColumn(name = "codinsumo", nullable = false)
    private InsumoEntity insumo;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="precio_unitario")
    private double precioUnitario;
    @Column(name="subtotal")
    private double subtotal;


}
