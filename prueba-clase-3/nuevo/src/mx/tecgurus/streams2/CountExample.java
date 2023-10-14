package mx.tecgurus.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

public class CountExample {

    public static void main(String[] args) {

        List<String> colores = Arrays.asList(
                "Amarillo",
                "Azul",
                "Verde",
                "Morado",
                "Anaranjado",
                "Rojo",
                "Dorado"
        );

        long conAInicial = colores
                .stream() // obtiene un stream de una lista
                .peek(System.out::println)
                .filter(elem -> elem.startsWith("X")) // startsWith recibe una cadena
                .count(); // Devuelve un long

        System.out.println("\n\t Número de elmentos que inician con A: "+conAInicial);

        // Ejemplo 2 en caso de no existir un elemento
        Stream<String> conBInicial = Stream
                .of(colores.toArray(new String[0]))
                .filter(elem -> elem.startsWith("B"));

        Optional<String> colorConB = conBInicial.findFirst();

        try{ // Controlamos la exception
            System.out.println("\n\t Elemento con B inicial: "+colorConB.orElseThrow());
        }catch (NoSuchElementException exception){
            System.out.println("\n\t Elemnto no contrado con B inicial");
        }

    }

}
