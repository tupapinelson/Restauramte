package Formularios;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmPedidos extends JFrame {

    public JTable tablaPedidos;
    public JButton btnAgregar;

    public FrmPedidos() {
        setTitle("Pedidos");
        setSize(600, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblTitulo = new JLabel("Lista de Pedidos");
        lblTitulo.setBounds(20, 10, 200, 30);
        add(lblTitulo);

        String[] columnas = {"ID", "Cliente", "Producto", "Cantidad", "Precio"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tablaPedidos = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tablaPedidos);
        scroll.setBounds(20, 50, 540, 250);
        add(scroll);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(240, 320, 120, 30);
        add(btnAgregar);
    }
}
