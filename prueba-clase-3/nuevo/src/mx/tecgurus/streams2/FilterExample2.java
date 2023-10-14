package mx.tecgurus.streams2;

import java.util.stream.Stream;

public class FilterExample2 {

    public static void main(String[] args) {

        // Primero crear un ejemplo del código necesario para
        // encontrar un elemento de una lista con cierta longitud.

        // Usando AnyMatch
        boolean esElemento = Stream.of(
                "enero",
                "febrero",
                "abril",
                "mayo",
                "julio",
                "octubre"
        ).map(String::length)
                .peek(System.out::println) // Se usa mucho para debuggear
                .anyMatch(tam -> tam==4); // Probar con otra longitud
        // Recibe una lambda de tipo Predicate

        // anyMatch devuelve un verdadero si hay al menos un elemento
        // que coincida con esas caracteristicas

        if(esElemento){
            System.out.println("\n\t El elemento existe");
        }else {
            System.out.println("\n\t El elemento no existe");
        }



    }

}
