package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="CategoriaEntity")
@Table(name="categoria")
public class CategoriaEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="codcategoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nomcategoria")
    private String nombre;
    @Column(name="descripcioncategoria")
    private String descripcion;
    @Column(name="estado")
    private boolean estado;
}
