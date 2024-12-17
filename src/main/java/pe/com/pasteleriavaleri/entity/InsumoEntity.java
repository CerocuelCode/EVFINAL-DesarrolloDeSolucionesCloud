package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="InsumoEntity")
@Table(name="insumo")
public class InsumoEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "codinsumo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name="nominsumo")
    private String nombre;
    @Column(name="descripcioninsumo")
    private String descripcion;
    @Column(name="unidad_medida")
    private String unidadMedida;
    @Column(name="stock_actual")
    private double stockActual;
    @Column(name="stock_minimo")
    private double stockMinimo;
    @Column(name="estado")
    private boolean estado;


}
