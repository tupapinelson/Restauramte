
package Servicio;

import Modelo.RolUsuario;
import Modelo.Usuario;
import Repositorio.Repositorio;
import java.util.List;

public class UsuarioServicio {
    private Repositorio<Usuario> repoUsuarios;
    
    public UsuarioServicio() {
        repoUsuarios = new Repositorio<>();
    }
    
    // Registrar un nuevo usuario
    public void registrarUsuario(Usuario usuario) {
        repoUsuarios.añadir(usuario);
    }
    
     // Obtener todos
    public List<Usuario> obtenerUsuarios() {
        return repoUsuarios.obtenerTodos();
    }
    
    // Buscar por username
    public Usuario buscarPorUsername(String username) {
        return repoUsuarios.buscarPrimero(u -> u.getUsername().equals(username));
    }
    
    // Validar login
    public Usuario validarLogin(String username, String contraseña) {
        return repoUsuarios.buscarPrimero(u ->
                u.getUsername().equals(username) && u.getContraseña().equals(contraseña));
    }
    
    // Buscar por rol (útil para reportes o asignar tareas)
    public List<Usuario> buscarPorRol(RolUsuario rol) {
        return repoUsuarios.buscar(u -> u.getRol() == rol);
    }
}
