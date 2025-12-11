package Formularios;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmCaja extends JFrame {

    public JTable tablaCaja;
    public JButton btnCobrar, btnActualizar;
    public JLabel lblTotal;

    public FrmCaja() {
        setTitle("Caja - Ventas del Día");
        setSize(600, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblTitulo = new JLabel("Control de Caja");
        lblTitulo.setBounds(20, 10, 200, 30);
        add(lblTitulo);

        String[] columnas = {"ID", "Cliente", "Monto", "Hora"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        tablaCaja = new JTable(modelo);

        JScrollPane scroll = new JScrollPane(tablaCaja);
        scroll.setBounds(20, 60, 540, 250);
        add(scroll);

        lblTotal = new JLabel("TOTAL: S/. 0.00");
        lblTotal.setBounds(20, 330, 200, 30);
        add(lblTotal);

        btnCobrar = new JButton("Cobrar");
        btnCobrar.setBounds(350, 330, 100, 30);
        add(btnCobrar);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(460, 330, 100, 30);
        add(btnActualizar);
    }
}
