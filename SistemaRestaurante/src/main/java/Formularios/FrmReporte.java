package Formularios;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmReporte extends JFrame {

    public JTable tablaReporte;
    public JButton btnGenerar;

    public FrmReporte() {
        setTitle("Reportes del Sistema");
        setSize(650, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblTitulo = new JLabel("REPORTES DE VENTAS");
        lblTitulo.setBounds(250, 20, 200, 30);
        add(lblTitulo);

        String[] columnas = {"Fecha", "Cliente", "Plato", "Cantidad", "Total"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        tablaReporte = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tablaReporte);
        scroll.setBounds(20, 70, 600, 260);
        add(scroll);

        btnGenerar = new JButton("Generar Reporte");
        btnGenerar.setBounds(260, 350, 150, 30);
        add(btnGenerar);
    }
}
