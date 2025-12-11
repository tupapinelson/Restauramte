package Formularios;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MenuPrincipalForm extends JFrame {

    public MenuPrincipalForm() {
        setTitle("Menú principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel encabezadoLabel = new JLabel("Sistema de restaurante", SwingConstants.CENTER);
        encabezadoLabel.setFont(encabezadoLabel.getFont().deriveFont(18f));
        add(encabezadoLabel, BorderLayout.NORTH);

        JTextArea descripcionArea = new JTextArea("Selecciona una opción para comenzar.\n"
                + "Desde aquí puedes gestionar pedidos, mesas, caja y reportes.");
        descripcionArea.setEditable(false);
        descripcionArea.setOpaque(false);
        descripcionArea.setWrapStyleWord(true);
        descripcionArea.setLineWrap(true);
        descripcionArea.setFocusable(false);
        add(descripcionArea, BorderLayout.CENTER);

        JPanel botonesPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        botonesPanel.add(new JButton("Mesas"));
        botonesPanel.add(new JButton("Pedidos"));
        botonesPanel.add(new JButton("Cocina"));
        botonesPanel.add(new JButton("Caja"));
        botonesPanel.add(new JButton("Reportes"));

        JButton cerrarButton = new JButton("Cerrar sesión");
        cerrarButton.addActionListener(evt -> volverALogin());
        botonesPanel.add(cerrarButton);

        add(botonesPanel, BorderLayout.SOUTH);

        pack();
    }

    private void volverALogin() {
        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
        dispose();
    }
}
