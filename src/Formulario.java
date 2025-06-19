import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
    private JButton mostrarDatos1Button;
    private JButton mostrarDatos2Button;
    private JTextField nombreText;
    private JTextField apellidoText;
    private JTextField direccionText;
    private JTextField telefonoText;
    private JTextField anioNacimText;
    private JTextField estaturaText;
    private JPanel PanelPrincipal;
    private JLabel datosLabel;

    public Formulario() {
        setTitle("Registro de información personal ");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(PanelPrincipal);
        setVisible(true);

        mostrarDatos1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreText.getText();
                String apellido = apellidoText.getText();
                String direccion = direccionText.getText();
                String telefono = telefonoText.getText();
                String anioNacim = anioNacimText.getText();
                String estatura = estaturaText.getText();

                String informacion = "Nombre: " + nombre +
                        "\nApellido: " + apellido +
                        "\nDirección: " + direccion +
                        "\nTeléfono: " + telefono +
                        "\nAño de Nacimiento: " + anioNacim +
                        "\nEstatura: " + estatura;

                JOptionPane.showMessageDialog(null, informacion);
            }
        });

        mostrarDatos2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreText.getText();
                String apellido = apellidoText.getText();
                String direccion = direccionText.getText();
                String telefono = telefonoText.getText();
                String anioNacim = anioNacimText.getText();
                String estatura = estaturaText.getText();

                String informacion = "Nombre: " + nombre +
                        "\nApellido: " + apellido +
                        "\nDirección: " + direccion +
                        "\nTeléfono: " + telefono +
                        "\nAño de Nacimiento: " + anioNacim +
                        "\nEstatura: " + estatura;

                datosLabel.setText(informacion);
            }
        });
    }

}
