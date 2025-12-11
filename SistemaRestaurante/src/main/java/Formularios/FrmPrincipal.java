package Formularios;

import javax.swing.*;

public class FrmPrincipal extends JFrame {

    public JButton btnCaja, btnMesas, btnCocina, btnReporte, btnSalir;

    public FrmPrincipal() {
        setTitle("Sistema Restaurante - Principal");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblTitulo = new JLabel("MENÚ PRINCIPAL");
        lblTitulo.setBounds(180, 20, 200, 30);
        add(lblTitulo);

        btnCaja = new JButton("Caja");
        btnCaja.setBounds(50, 80, 150, 40);
        add(btnCaja);

        btnMesas = new JButton("Mesas");
        btnMesas.setBounds(250, 80, 150, 40);
        add(btnMesas);

        btnCocina = new JButton("Cocina");
        btnCocina.setBounds(50, 150, 150, 40);
        add(btnCocina);

        btnReporte = new JButton("Reportes");
        btnReporte.setBounds(250, 150, 150, 40);
        add(btnReporte);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(180, 250, 120, 40);
        add(btnSalir);
    }
}
