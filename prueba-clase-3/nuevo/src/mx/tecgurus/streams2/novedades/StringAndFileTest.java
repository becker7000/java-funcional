package mx.tecgurus.streams2.novedades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// JAVA 11
public class StringAndFileTest {

    public static void main(String[] args) {

        // Método nuevo en la clase String: isBlank()
        String texto = "   ";
        System.out.println("¿El texto está en blanco? " + texto.isBlank());

        // Tiene que ser la ruta absoluta:
        Path archivoPath = Path.of("C:\\Users\\becke\\Documents\\TecGurus\\programacion funcional\\prueba-clase-3\\nuevo\\src\\mx\\tecgurus\\streams2\\novedades\\archivo.txt");

        // Se inicializa el contenido en nulo
        String contenido = null;
        try {
            // Método nuevo en la clase Files: readString()
            contenido = Files.readString(archivoPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Contenido del archivo: " + contenido);

    }

}
