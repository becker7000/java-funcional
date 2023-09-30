package mx.tecgurus.lambdas;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        // Primero hacer forma larga
        //BiFunction<String,String,Integer> function = (a,b) -> a.compareTo(b);

        // Usando una referencia a un método
        BiFunction<String,String,Integer> function = String::compareTo;
        System.out.println("\n\t Resultado: "+function.apply("abc","abc"));

    }

}
