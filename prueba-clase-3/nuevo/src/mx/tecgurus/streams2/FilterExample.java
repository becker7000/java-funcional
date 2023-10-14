package mx.tecgurus.streams2;

import java.util.stream.Stream;

public class FilterExample {

    public static void main(String[] args) {

        String nombre_especial = Stream.of(
                "Juan",
                "María",
                "Laura",
                "Julia",
                "Sam",
                "Eder"
        ).map( String::toUpperCase)
                .peek(System.out::println)
                .filter( nombre -> nombre.equals("SAM"))
                .findFirst().get();
        // FindFirst devuelve un elemento (objeto) del Stream

        System.out.printf("\n\t Nombre encontrado: %s",nombre_especial);

        // Peek nos muestra como se detiene el proceso hasta 'SAM'

    }

}
