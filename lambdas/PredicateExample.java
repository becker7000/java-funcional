package mx.tecgurus.lambdas;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        // Siempre regresa un booleano (verdadero o falso):
        Predicate<Integer> test = num -> num>10;

        // El método test sirve para pasar un parametro de tipo T:
        boolean result = test.test(11);

        // Mostramos el resultado:
        System.out.printf("\n\t Resultado: %B",result);

        // Otro ejemplo:
        Predicate<String> test2 = role -> role.equals("ADMIN");

        boolean result2 = test2.test("USER");
        System.out.printf("\n\t Resultado 2: %B",result2);

    }

}
