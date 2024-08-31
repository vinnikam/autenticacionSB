package co.vinni.Autenticacion.repositorio;

import co.vinni.Autenticacion.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
