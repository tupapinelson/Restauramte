
package Modelo;

public class Cocinero extends Empleado{

    public Cocinero(int id, String nombre, Usuario usuario) {
        super(id, nombre, usuario);
    }
    
    @Override
    public String toString(){
        return "Cocinero: "+ nombre;
    }
    
}
