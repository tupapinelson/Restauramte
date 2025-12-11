
package Modelo;

public class Usuario {
    private int id;
    private String username;
    private String contraseña;
    private RolUsuario rol;

    public Usuario(int id, String username, String contraseña, RolUsuario rol) {
        this.id = id;
        this.username = username;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public RolUsuario getRol() {
        return rol;
    }
    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }
    
    @Override
    public String toString(){
        return username + " - "+ rol;
    }
    
}
