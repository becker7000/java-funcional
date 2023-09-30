package mx.tecgurus.lambdas;

import java.util.function.Function;

public class FunctionExample3 {

    public static void main(String[] args) {

        // Creamos 2 funciones:
        Function<Integer,String> convertirAString = String::valueOf;
        Function<String,Integer> obtenerLongitud = String::length;

        // Composición de funciones:
        Function<Integer,Integer> convertirYObtenerLongitud = convertirAString.andThen(obtenerLongitud);

        int numero = 293823;

        // Aplicando la funcion compuesta:
        int longitud = convertirYObtenerLongitud.apply(numero);
        System.out.printf("\n\t Número: %s, longitud: %d",numero,longitud);


    }

}
