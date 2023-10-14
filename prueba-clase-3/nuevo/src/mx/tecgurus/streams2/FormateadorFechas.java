package mx.tecgurus.streams2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormateadorFechas extends JFrame {

    private JPanel panel;
    private JButton formato1Button;
    private JButton formato2Button;
    private JButton formato3Button;
    private JButton formato4Button;
    private JTextArea fechaTextArea;
    private DateTimeFormatter[] formateadores = {
            DateTimeFormatter.ofPattern("dd/MM/yyyy"),
            DateTimeFormatter.ofPattern("MM/dd/yyyy"),
            DateTimeFormatter.ofPattern("yyyy/MM/dd"),
            DateTimeFormatter.ofPattern("dd-MM-yyyy")
    };

    public FormateadorFechas() {

        this.setTitle("Formateador de fechas");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(panel);
        this.iniciarBotones(); // Cada uno con un formato
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarBotones() {

        // Ejemplo con la versión larga:
        formato1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormato(0);
            }
        });

        // Luego mostrar las formas con lambdas:
        formato2Button.addActionListener(e -> mostrarFormato(1));
        formato3Button.addActionListener(e -> mostrarFormato(2));
        formato4Button.addActionListener(e -> mostrarFormato(3));

    }

    private void mostrarFormato(int indice) {
        // Obtenemos la fecha y hora actuales del servidor
        LocalDateTime ahora = LocalDateTime.now();
        // Damos un formato con el método 'format'
        // El formato debe ser de la clase 'DateTimeFormater'
        String fechaFormateada = ahora.format(formateadores[indice]);
        // Mostramos la fecha
        fechaTextArea.setText(fechaFormateada);
    }

}
