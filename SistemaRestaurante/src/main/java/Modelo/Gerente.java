
package Modelo;

public class Gerente extends Empleado{
    private int empleadosAcargo;

    public Gerente(int empleadosAcargo, int id, String nombre, Usuario usuario) {
        super(id, nombre, usuario);
        this.empleadosAcargo = empleadosAcargo;
    }

    public int getEmpleadosAcargo() {
        return empleadosAcargo;
    }

    public void setEmpleadosAcargo(int empleadosAcargo) {
        this.empleadosAcargo = empleadosAcargo;
    }
    
    @Override
    public String toString(){
        return "Gerente: "+ nombre + " - Empleados a cargo: "+ empleadosAcargo;
    }
    
}
