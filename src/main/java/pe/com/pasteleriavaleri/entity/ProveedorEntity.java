package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="ProveedorEntity")
@Table(name="proveedor")
public class ProveedorEntity implements Serializable  {

    private static final long serialVersionUID=1L;

    @Id
    @Column(name = "codproveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name="nomproveedor")
    private String nombre;
    @Column(name="dirproveedor")
    private String direccion;
    @Column(name="correoproveedor")
    private String correo;
    @Column(name="telefonoproveedor")
    private String telefono;
    @Column(name="estado")
    private boolean estado;

}
