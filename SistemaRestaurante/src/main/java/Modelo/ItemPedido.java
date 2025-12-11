
package Modelo;

public class ItemPedido {
    private Platillo platillo;
    private int cantidad;

    public ItemPedido(Platillo platillo, int cantidad) {
        this.platillo = platillo;
        this.cantidad = cantidad;
    }

    public Platillo getPlatillo() {
        return platillo;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal(){
        return platillo.getPrecio() * cantidad;
    }
    
    public String ToString(){
        return cantidad + " x "+ platillo.getNombre() + " = "+ getSubTotal();
    }
    
}
