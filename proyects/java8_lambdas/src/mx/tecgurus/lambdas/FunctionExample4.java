package mx.tecgurus.lambdas;

import java.util.function.Function;

public class FunctionExample4 {

    public static void main(String[] args) {

        // Función para calcular el doble de un número
        Function<Double, Double> doble = num -> num * 2.0;

        // Función para calcular el cuadrado de un número
        Function<Double, Double> cuadrado = num -> num * num;

        // Función para calcular el seno de un número
        Function<Double, Double> seno = Math::sin;

        // Componer las funciones: seno(doble(cuadrado(x)))
        Function<Double, Double> composicion = doble.andThen(cuadrado).andThen(seno);

        // Calcular el resultado para un número dado (por ejemplo, 1.0)
        double numero = 1.0;
        double resultado = composicion.apply(numero);

        System.out.println("El seno del doble del cuadrado de " + numero + " es: " + resultado);

    }

}
