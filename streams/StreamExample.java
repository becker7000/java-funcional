package mx.tecgurus.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        //FORMA 1:

        Stream<String> nombres_stream = Stream.of(
                "Luis",
                "Eduardo",
                "Antonio",
                "Laura",
                "Tania",
                "Julia"
        );

        // forEach es un operador que recibe un Consumer<T>
        // no modifica el flujo y no devuelve nada
        System.out.println("\n\nNombres: ");
        nombres_stream.forEach(System.out::println);

        // FORMA 2:

        // Supongamos un arreglo de frutas:
        String[] frutas = {
                "Manzana",
                "Durazno",
                "Sandía",
                "Mango",
                "Uva",
                "Platano",
                "Naranja"
        };

        // Declaramos otro stream para las frutas
        Stream<String> frutas_stream = Arrays.stream(frutas);

        System.out.println("\n\nFrutas: ");
        frutas_stream.forEach(System.out::println);

        // FORMA 3:

        // Usando un constructor de stream con un tipo de dato generico
        Stream<String> paises_stream = Stream
                .<String>builder()
                .add("México")
                .add("Perú")
                .add("Colombia")
                .add("Brasíl")
                .build();

        // Mostramos los elementos:
        System.out.println("\n\nPaises: ");
        paises_stream.forEach(System.out::println);

        // FORMA 4:

        // Creando una lista y luego pasandola a un stream
        List<String> bebidas;

        bebidas = Arrays.asList(
                "Capuccino",
                "Chai latte",
                "Makiato",
                "Expresso",
                "Cold brew"
        );

        // Obtenemos un stream de la lista con el método stream
        Stream<String> bebidas_stream = bebidas.stream();

        // Mostramos el stream:
        System.out.println("\n\nBebidas: ");
        bebidas_stream.forEach(System.out::println);

        // Por ejemplo si no queremos usar crear un objeto de Stream
        // podemos sólo usarlo:

        System.out.println("\n\nBebidas sin crear objeto stream: ");
        bebidas.stream().forEach(System.out::println);

    }

}
