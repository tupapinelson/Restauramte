
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private Mesa mesa;
    private EstadoPedido estado;
    private List<ItemPedido> items;

    public Pedido(int id, Date fecha, Cliente cliente, Mesa mesa, EstadoPedido estado ) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.mesa = mesa;
        this.estado = estado;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    
    public void agregarItem(ItemPedido item){
        items.add(item);
    }
    
    public double getTotal(){
        double total= 0;
        for (ItemPedido item : items) {
            total += item.getSubTotal();
        }
        return total;
    }
    
    @Override
    public String toString(){
        return "Pedido #"+ id+ " - Mesa: "+ mesa.getNumero()+ " - Total: "+ getTotal();
    }
    
}
