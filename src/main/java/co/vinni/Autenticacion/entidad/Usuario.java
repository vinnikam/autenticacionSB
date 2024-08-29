package co.vinni.Autenticacion.entidad;

import jakarta.persistence.*;

@Entity(name = "Usuario")
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    private long codigo;
    private String nombreApellido;
    private String nombreUsuario;
    private String clave;

}
