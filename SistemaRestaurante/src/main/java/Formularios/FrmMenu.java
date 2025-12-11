package Formularios;

import javax.swing.*;

public class FrmMenu extends JFrame {

    public JButton btnLogin, btnClientes, btnPedidos, btnCaja, btnMesas, btnCocina, btnReportes, btnSalir;

    public FrmMenu() {
        setTitle("Sistema Restaurante - Menú Principal");
        setSize(600, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblTitulo = new JLabel("MENÚ PRINCIPAL DEL SISTEMA");
        lblTitulo.setBounds(180, 20, 300, 30);
        add(lblTitulo);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(60, 80, 200, 40);
        add(btnLogin);

        btnClientes = new JButton("Clientes");
        btnClientes.setBounds(320, 80, 200, 40);
        add(btnClientes);

        btnPedidos = new JButton("Pedidos");
        btnPedidos.setBounds(60, 150, 200, 40);
        add(btnPedidos);

        btnCaja = new JButton("Caja");
        btnCaja.setBounds(320, 150, 200, 40);
        add(btnCaja);

        btnMesas = new JButton("Mesas");
        btnMesas.setBounds(60, 220, 200, 40);
        add(btnMesas);

        btnCocina = new JButton("Cocina");
        btnCocina.setBounds(320, 220, 200, 40);
        add(btnCocina);

        btnReportes = new JButton("Reportes");
        btnReportes.setBounds(190, 290, 200, 40);
        add(btnReportes);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(240, 360, 120, 40);
        add(btnSalir);

        // Puedes agregar aquí los listeners para abrir cada formulario
        // Ejemplo:
        btnClientes.addActionListener(e -> new FrmClientes().setVisible(true));
        btnPedidos.addActionListener(e -> new FrmPedidos().setVisible(true));
        btnLogin.addActionListener(e -> new Frmlogin().setVisible(true));
        btnMesas.addActionListener(e -> new FrmMesas().setVisible(true));
        btnCocina.addActionListener(e -> new FrmCocina().setVisible(true));
        btnCaja.addActionListener(e -> new FrmCaja().setVisible(true));
        btnReportes.addActionListener(e -> new FrmReporte().setVisible(true));

        btnSalir.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        new FrmMenu().setVisible(true);
    }
}
