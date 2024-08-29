package co.vinni.Autenticacion.controlador;

import co.vinni.Autenticacion.entidad.Usuario;
import co.vinni.Autenticacion.servicios.UsuarioSevicio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/usuarios")
@RestController
public class UsuarioControlador implements Serializable {

    @Autowired
    UsuarioSevicio usuarioSevicio;

    @GetMapping("/{codigo}")
    public ResponseEntity<Usuario> obtenerPorId(@PathVariable("serial") Long codigo) {

        return ResponseEntity.ok(usuarioSevicio.buscarXId(codigo));
    }
    @GetMapping("/")
    public ResponseEntity<List<Usuario>> listarEquipos(){

        return ResponseEntity.ok(usuarioSevicio.buscarTodos());
    }

}