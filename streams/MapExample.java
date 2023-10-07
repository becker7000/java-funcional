package mx.tecgurus.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample {

    public static void main(String[] args) {

        // Creando una lista y luego pasandola a un stream
        List<String> bebidas;

        bebidas = Arrays.asList(
                "Capuccino",
                "Chai latte",
                "Makiato",
                "Expresso",
                "Cold brew"
        );

        // Cada que invocamos un operador se crea una nueva instancia de un stream

        // Probamos el módo largo primero:
        // Stream<String> bebidas_mayus = bebidas.stream().map( b -> b.toUpperCase(Locale.ROOT));

        Stream<String> bebidas_stream = bebidas.stream().map(String::toUpperCase);

        // Líneas que deben ser comentadas
        System.out.println("\n\nBebidas en mayúsculas:");
        bebidas_stream.forEach(System.out::println);

        System.out.println("\n\nBebidas en minúsculas:");
        // Sin crear un objeto Stream
        bebidas.stream().map(String::toLowerCase).forEach(System.out::println);
        // Encadenamiento de métodos.

        List<String> bebidas_transformada = bebidas_stream.collect(Collectors.toList());

        // Se genera una IllegalStateException
        // ya que se está intentando utilizar
        // Stream después de que ya ha sido consumido
        // (terminal operation forEach() ha sido llamado)
        // Debemos comentar las líneas 32 y 33
        System.out.println("\n\nNueva lista:");
        bebidas_transformada.forEach(System.out::println);

    }

}
