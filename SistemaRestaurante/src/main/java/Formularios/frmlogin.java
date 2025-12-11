package Formularios;

import javax.swing.*;

public class Frmlogin extends JFrame {

    public JButton btnCrear, btnLeer, btnActualizar, btnEliminar;
    public JTextField txtUsuario, txtPassword;

    public Frmlogin() {
        setTitle("Login - CRUD");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 120, 30);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 30, 180, 30);
        add(txtUsuario);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setBounds(30, 70, 120, 30);
        add(lblPassword);

        txtPassword = new JTextField();
        txtPassword.setBounds(150, 70, 180, 30);
        add(txtPassword);

        btnCrear = new JButton("Crear");
        btnCrear.setBounds(20, 140, 80, 30);
        add(btnCrear);

        btnLeer = new JButton("Leer");
        btnLeer.setBounds(110, 140, 80, 30);
        add(btnLeer);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(200, 140, 100, 30);
        add(btnActualizar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(310, 140, 80, 30);
        add(btnEliminar);
    }
}
