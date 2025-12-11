
package Modelo;

public class Mesa {
    private int id;
    private int numero;
    private int capacidad;
    private EstadoMesa estado;

    public Mesa(int id, int numero, int capacidad, EstadoMesa estado) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public EstadoMesa getEstado() {
        return estado;
    }
    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa: " + numero + " (" + estado + ")";
    }
    
    
    
}
