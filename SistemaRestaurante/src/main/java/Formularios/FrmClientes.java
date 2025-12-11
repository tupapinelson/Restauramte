package Formularios;

import javax.swing.*;

public class FrmClientes extends JFrame {

    public JTextField txtNombre, txtApellido, txtDNI;
    public JButton btnCrear, btnLeer, btnActualizar, btnEliminar;

    public FrmClientes() {
        setTitle("Clientes - CRUD");
        setSize(450, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 120, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 30, 200, 30);
        add(txtNombre);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setBounds(30, 80, 120, 30);
        add(lblApellido);

        txtApellido = new JTextField();
        txtApellido.setBounds(150, 80, 200, 30);
        add(txtApellido);

        JLabel lblDNI = new JLabel("DNI:");
        lblDNI.setBounds(30, 130, 120, 30);
        add(lblDNI);

        txtDNI = new JTextField();
        txtDNI.setBounds(150, 130, 200, 30);
        add(txtDNI);

        btnCrear = new JButton("Crear");
        btnCrear.setBounds(30, 200, 80, 30);
        add(btnCrear);

        btnLeer = new JButton("Leer");
        btnLeer.setBounds(120, 200, 80, 30);
        add(btnLeer);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(210, 200, 100, 30);
        add(btnActualizar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(320, 200, 100, 30);
        add(btnEliminar);
    }
}
