package mx.tecgurus.streams2.novedades;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// JAVA 11
public class PredicateExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Filtrar los números que NO son pares usando Predicate.not()

        Predicate<Integer> esPar = num -> num % 2 == 0;
        Predicate<Integer> noEsPar = Predicate.not(esPar);

        List<Integer> numerosImpares = filtrarLista(numeros, noEsPar);

        System.out.println("Números impares: " + numerosImpares);
    }

    // Con este mismo método podemos crear varios filtrados
    // Solo tenemos que crear predicados
    private static <T> List<T> filtrarLista(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(predicate)
                .toList();
    }

}
