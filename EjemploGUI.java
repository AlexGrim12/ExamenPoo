import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton botonSaludo = new JButton("Saludar");
        JLabel etiquetaMensaje = new JLabel("");

        botonSaludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaMensaje.setText("¡Hola, mundo!");
            }
        });

        panel.add(botonSaludo);
        panel.add(etiquetaMensaje);
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
