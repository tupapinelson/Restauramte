
package Modelo;

import java.util.List;

public class Mesero extends Empleado{
    private List<Mesa> mesasAsiganadas;

    public Mesero(List<Mesa> mesasAsiganadas, int id, String nombre, Usuario usuario) {
        super(id, nombre, usuario);
        this.mesasAsiganadas = mesasAsiganadas;
    }

    public List<Mesa> getMesasAsiganadas() {
        return mesasAsiganadas;
    }
    
    public void asignarMesa(Mesa mesa){
        mesasAsiganadas.add(mesa);
    }
    
    public void removerMesa(Mesa mesa){
        mesasAsiganadas.remove(mesa);
    }
    
    @Override
    public String toString(){
        return "Mesero" + nombre + " - Mesas asignadas: "+ mesasAsiganadas.size();
    }
    
}
