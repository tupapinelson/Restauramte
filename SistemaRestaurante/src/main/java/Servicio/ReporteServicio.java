
package Servicio;

import Modelo.EstadoPedido;
import Modelo.ItemPedido;
import Repositorio.Repositorio;
import Modelo.Pedido;
import Modelo.Platillo;
import java.util.HashMap;
import java.util.Map;

public class ReporteServicio {
    private Repositorio<Pedido> repoPedidos;

    public ReporteServicio(Repositorio<Pedido> repoPedidos) {
        this.repoPedidos = repoPedidos;
    }
    
    //Ventas totales
     public double calcularVentasTotales() {
        return repoPedidos.obtenerTodos().stream()
                .filter(p -> p.getEstado() == EstadoPedido.Completado)
                .mapToDouble(Pedido::getTotal)
                .sum();
    }
    
    //plato mas vendido
    public Map<Platillo, Integer> calcularPlatillosMasVendidos() {
        Map<Platillo, Integer> contador = new HashMap<>();

        for (Pedido pedido : repoPedidos.obtenerTodos()) {
            if (pedido.getEstado() != EstadoPedido.Completado) continue;

            for (ItemPedido item : pedido.getItems()) {
                Platillo p = item.getPlatillo();
                int cantidad = item.getCantidad();

                contador.put(p, contador.getOrDefault(p, 0) + cantidad);
            }
        }

        return contador; // Se interpreta desde la interfaz
    }
    
    //pedidos por estado
    public long contarPedidosPorEstado(EstadoPedido estado) {
        return repoPedidos.obtenerTodos().stream()
                .filter(p -> p.getEstado() == estado)
                .count();
    }
    

}
