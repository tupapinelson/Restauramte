
package Modelo;

public class Empleado {
    protected int id;
    protected String nombre;
    protected Usuario usuario;

    public Empleado(int id, String nombre, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getRol(){
        return usuario.getRol().toString();
    }
    
    @Override
    public String toString(){
        return nombre + " - "+ usuario.getRol();
    }
    
}
