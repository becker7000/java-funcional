package mx.tecgurus.lambdas;

import mx.tecgurus.lambdas.modelos.AnalizadorDirectorio;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample3 {

    public static void main(String[] args) {

        String ruta = "C:\\Users\\becke\\Documents\\TecGurus\\programacion funcional\\proyects\\java8_lambdas\\src\\mx\\tecgurus\\lambdas";
        AnalizadorDirectorio analizadorDir = new AnalizadorDirectorio(ruta);
        List<String> rutasArchivos = analizadorDir.obtenerRutasDeArchivos();

        Consumer<String> mostrarTamanoArchivos = path -> {
            File archivo = new File(path);
            System.out.printf("\n\t Archivo: %s, Tamaño: %d bytes",archivo.getName(),archivo.length());
        };

        rutasArchivos.forEach(mostrarTamanoArchivos);

    }

}
