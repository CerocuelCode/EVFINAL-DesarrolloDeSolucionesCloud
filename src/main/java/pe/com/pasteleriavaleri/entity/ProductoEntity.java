package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="ProductoEntity")
@Table(name="producto")
public class ProductoEntity implements Serializable  {

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "codproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;


    @ManyToOne
    @JoinColumn(name = "codcategoria", nullable = false)
    private CategoriaEntity categoria;

    @Column(name="nomproducto")
    private String nombre;
    @Column(name="descripcionproducto")
    private String descripcion;
    @Column(name="precio")
    private double precio;
    @Column(name="tiempo_preparacion")
    private int tiempoPreparacion;
    @Column(name="stock")
    private int stock;
    @Column(name="estado")
    private boolean estado;

}
