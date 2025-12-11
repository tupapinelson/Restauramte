
package Servicio;

import Modelo.Cliente;
import Modelo.EstadoPedido;
import Modelo.Mesa;
import Modelo.Pedido;
import Modelo.Platillo;
import Repositorio.Repositorio;
import java.util.List;
import java.util.Date;

public class NegocioServicio {
    private Repositorio<Mesa> repoMesa;
    private Repositorio<Pedido> repoPedido;
    private Repositorio<Platillo> repoPlatillo;
    private Repositorio<Cliente> repoCliente;
    
    
    public NegocioServicio(){
        this.repoMesa= new Repositorio<>();
        this.repoPedido= new Repositorio<>();
        this.repoPlatillo= new Repositorio<>();
        this.repoCliente= new Repositorio<>();
    }
    
    //MESAS
    public void agregarMesa(Mesa mesa){
        repoMesa.añadir(mesa);
    }
    public List<Mesa> obtenerMesa(){
        return repoMesa.obtenerTodos();
    }
    public Mesa buscarXnumero(int numero){
        return repoMesa.buscarPrimero(m -> m.getNumero()== numero);
    }
    
    //CLIENTES
    public void agregarCliente(Cliente cliente){
        repoCliente.añadir(cliente);
    }
    public List<Cliente> obtenerCliente(){
        return repoCliente.obtenerTodos();
    }
    public Cliente buscarPorID(int id){
        return repoCliente.buscarPrimero(c -> c.getId()== id);
    }
    
    //PEDIDOS
    public Pedido crearPedido(int id, Cliente cliente, Mesa mesa){
        Pedido nuevo= new Pedido(id, new Date(), cliente, mesa, EstadoPedido.Pendiente);
        repoPedido.añadir(nuevo);
        return nuevo;
    }
    public List<Pedido> obtenerPedidos(){
        return repoPedido.obtenerTodos();
    }
    
    public Pedido buscarPedidoPorId(int id) {
        return repoPedido.buscarPrimero(p -> p.getId() == id);
    }
    
    public void cambiarEstadoPedido(Pedido pedido, EstadoPedido nuevoEstado) {
        pedido.setEstado(nuevoEstado);
    }
}
