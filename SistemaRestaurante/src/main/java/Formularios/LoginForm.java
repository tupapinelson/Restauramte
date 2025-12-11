package Formularios;

import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginForm extends JFrame {

    private final JTextField usuarioTextField;
    private final JPasswordField contraseniaField;
    private final JLabel mensajeLabel;

    public LoginForm() {
        setTitle("Ingreso al sistema");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel tituloLabel = new JLabel("Bienvenido al sistema del restaurante", JLabel.CENTER);
        tituloLabel.setFont(tituloLabel.getFont().deriveFont(16f));

        JLabel usuarioLabel = new JLabel("Usuario");
        usuarioTextField = new JTextField();

        JLabel contraseniaLabel = new JLabel("Contraseña");
        contraseniaField = new JPasswordField();

        JButton ingresarButton = new JButton("Ingresar");
        ingresarButton.addActionListener(this::ingresar);

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.addActionListener(evt -> limpiarCampos());

        mensajeLabel = new JLabel(" ");

        JPanel contentPanel = new JPanel();
        GroupLayout layout = new GroupLayout(contentPanel);
        contentPanel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(tituloLabel)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(usuarioLabel)
                        .addComponent(contraseniaLabel))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(usuarioTextField)
                        .addComponent(contraseniaField)))
                .addComponent(mensajeLabel)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(cancelarButton)
                    .addComponent(ingresarButton))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(tituloLabel)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel)
                    .addComponent(usuarioTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseniaLabel)
                    .addComponent(contraseniaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addComponent(mensajeLabel)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButton)
                    .addComponent(ingresarButton))
        );

        setContentPane(contentPanel);
        pack();
    }

    private void ingresar(ActionEvent evt) {
        String usuario = usuarioTextField.getText().trim();
        String contrasenia = new String(contraseniaField.getPassword());

        if (usuario.isEmpty() || contrasenia.isEmpty()) {
            mensajeLabel.setText("Ingresa tus credenciales para continuar.");
            return;
        }

        mensajeLabel.setText("Inicio de sesión correcto. ¡Bienvenido, " + usuario + "!");
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipalForm().setVisible(true);
        });
        dispose();
    }

    private void limpiarCampos() {
        usuarioTextField.setText("");
        contraseniaField.setText("");
        mensajeLabel.setText(" ");
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new LoginForm().setVisible(true));
    }
}
