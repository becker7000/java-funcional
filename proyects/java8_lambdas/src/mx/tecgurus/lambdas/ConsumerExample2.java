package mx.tecgurus.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {

        // Primero explicarlo en modo largo
        // Consumer<String> imprimir = mensaje -> System.out.println(mensaje);

        // :: operador de resolución de alcance
        Consumer<String> imprimir = System.out::println;
        imprimir.accept("Hola a todos desde un Consumer");

        // Generamos una lista de forma practica
        // Métodos en expresiones lambda
        List<String> listaPersonas = Arrays.asList("Laura","Antonio","Carlos","Pepe","Eder");
        listaPersonas.forEach(imprimir);



    }

}
