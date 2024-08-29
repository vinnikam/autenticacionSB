package co.vinni.Autenticacion.servicios;

import co.vinni.Autenticacion.entidad.Usuario;
import co.vinni.Autenticacion.repositorio.UsuarioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Service
public class UsuarioSevicio implements Serializable {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public Usuario buscarXId(long idPk){
        return  this.usuarioRepositorio.findById(idPk).orElse(null);
    }
    public List<Usuario> buscarTodos(){
        return this.usuarioRepositorio.findAll();
    }
}
