package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="CompraEntity")
@Table(name="compra")
public class CompraEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="codcompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @ManyToOne
    @JoinColumn(name = "codproveedor", nullable = false)
    private ProveedorEntity proveedor;

    @ManyToOne
    @JoinColumn(name = "codempleado", nullable = false)
    private ProveedorEntity empleado;

    @Column(name="fechacompra")
    private Date fechaCompra;
    @Column(name="totalcompra")
    private double totalCompra;
    @Column(name="estado")
    private boolean estado;
}
