package Formularios;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmCocina extends JFrame {

    public JTable tablaCocina;
    public JButton btnListo;

    public FrmCocina() {
        setTitle("Cocina - Pedidos Pendientes");
        setSize(600, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblTitulo = new JLabel("PEDIDOS EN COCINA");
        lblTitulo.setBounds(200, 20, 200, 30);
        add(lblTitulo);

        String[] columnas = {"ID", "Mesa", "Plato", "Cantidad", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        tablaCocina = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tablaCocina);
        scroll.setBounds(20, 70, 540, 260);
        add(scroll);

        btnListo = new JButton("Marcar como Listo");
        btnListo.setBounds(220, 350, 160, 30);
        add(btnListo);
    }
}
