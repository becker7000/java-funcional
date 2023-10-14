package mx.tecgurus.streams2.novedades;

import java.util.List;

// JAVA 11
public class ToArrayTest {

    public static void main(String[] args) {

        // Creamos una lista de cadenas
        List<String> palabras = List.of("Java", "es", "genial");

        // Convertir la lista de palabras a un array de Strings usando toArray()
        String[] arrayPalabras = palabras
                .stream()
                .toArray(String[]::new);

        // join une los elementos de un array como cadena
        // puede usar una cadena como separador de cada elemento.
        System.out.println("Array de palabras: \t" + String.join("\t", arrayPalabras));

    }

}
