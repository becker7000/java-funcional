package mx.tecgurus.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample2 {

    public static void main(String[] args) {

        List<String> listaFrutas = Arrays.asList("Manzana","Pera","Mango","Uva","Sandía");
        Function<String,Integer> obtenerLongitud = String::length;

        // Aquí no podemos usar un forEach ya que no es Consumer
        for(String fruta : listaFrutas ){
            System.out.printf("\n\t Fruta: %s, longitud: %d",fruta,obtenerLongitud.apply(fruta));
        }

    }

}
