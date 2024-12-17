package pe.com.pasteleriavaleri.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "EmpleadoEntity")
@Table(name = "empleado")
public class EmpleadoEntity implements Serializable  {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="codempleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nomempleado")
    private String nombre;
    @Column(name="apeempleado")
    private String apellido;
    @Column(name="dirempleado")
    private String direccion;
    @Column(name="correoempleado")
    private String correo;
    @Column(name="telefonoempleado")
    private String telefono;
    @Column(name="puesto")
    private String puesto;
    @Column(name="fecha_contratacion")
    private Date fechaContratacion;
    @Column(name="estado")
    private boolean estado;
}
