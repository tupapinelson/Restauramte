package Formularios;

import javax.swing.*;

public class FrmMesas extends JFrame {

    public JButton mesa1, mesa2, mesa3, mesa4, mesa5, mesa6;

    public FrmMesas() {
        setTitle("Control de Mesas");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblTitulo = new JLabel("ESTADO DE MESAS");
        lblTitulo.setBounds(180, 20, 200, 30);
        add(lblTitulo);

        mesa1 = new JButton("Mesa 1");
        mesa1.setBounds(50, 80, 120, 40);
        add(mesa1);

        mesa2 = new JButton("Mesa 2");
        mesa2.setBounds(200, 80, 120, 40);
        add(mesa2);

        mesa3 = new JButton("Mesa 3");
        mesa3.setBounds(350, 80, 120, 40);
        add(mesa3);

        mesa4 = new JButton("Mesa 4");
        mesa4.setBounds(50, 150, 120, 40);
        add(mesa4);

        mesa5 = new JButton("Mesa 5");
        mesa5.setBounds(200, 150, 120, 40);
        add(mesa5);

        mesa6 = new JButton("Mesa 6");
        mesa6.setBounds(350, 150, 120, 40);
        add(mesa6);
    }
}
