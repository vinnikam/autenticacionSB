package co.vinni.Autenticacion.entidad;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Usuario")
@Table(name = "USUARIOS")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private String nombreApellido;
    private String nombreUsuario;
    private String clave;

}
