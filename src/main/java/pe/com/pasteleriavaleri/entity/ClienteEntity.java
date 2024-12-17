package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="ClienteEntity")
@Table(name="cliente")
public class ClienteEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="codcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nomcliente")
    private String nombre;
    @Column(name="apecliente")
    private String apellido;
    @Column(name="dircliente")
    private String direccion;
    @Column(name="correocliente")
    private String correo;
    @Column(name="telefonocliente")
    private String telefono;
    @Column(name="estado")
    private boolean estado;
}
