package mx.tecgurus.lambdas;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        // Fuction usa el método apply para pasarle un parametro
        Function<String,String> saludar = nombre -> "Hola que tal "+nombre;
        System.out.println(saludar.apply("Pedro"));

        // Función con refenrencia a un método

        // Primero hacer en modo lambda completa:
        //Function<String,String> transformar = mensaje -> mensaje.toUpperCase(Locale.ROOT);

        // Ahora tenemos una referencia a un método.
        Function<String,String> transformar = String::toUpperCase;
        System.out.println("\n\t Mensaje: "+transformar.apply("brasil"));


    }

}
