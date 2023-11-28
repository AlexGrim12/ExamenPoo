import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploGUI {

    public static void main(String[] args) {
        // Crear un objeto de la clase JFrame (ventana principal)
        JFrame frame = new JFrame("Ejemplo GUI");

        // Establecer el comportamiento de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un objeto de la clase JPanel (panel que contendrá los componentes)
        JPanel panel = new JPanel();

        // Crear un objeto de la clase JButton (botón)
        JButton botonSaludo = new JButton("Saludar");

        // Crear un objeto de la clase JLabel (etiqueta para mostrar el mensaje)
        JLabel etiquetaMensaje = new JLabel("");

        // Agregar un ActionListener al botón para manejar los clics
        botonSaludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción a realizar cuando se hace clic en el botón
                etiquetaMensaje.setText("¡Hola, mundo!");
            }
        });

        // Agregar el botón y la etiqueta al panel
        panel.add(botonSaludo);
        panel.add(etiquetaMensaje);

        // Agregar el panel a la ventana
        frame.getContentPane().add(panel);

        // Establecer el tamaño de la ventana
        frame.setSize(300, 200);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
