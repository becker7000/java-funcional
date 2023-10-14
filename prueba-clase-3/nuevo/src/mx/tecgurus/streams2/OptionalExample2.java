package mx.tecgurus.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample2 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 8, 12, 3, 15, 7);

        // Encontrar el primer número mayor que 10 usando Optional y orElseThrow
        Optional<Integer> primerNumeroMayorQue10 = numeros.stream()
                .filter(numero -> numero > 10) // Probar con 80
                .findFirst();
        try{
            // Usar orElseThrow para obtener el resultado o lanzar una excepción si no hay resultado
            int resultado = primerNumeroMayorQue10.orElseThrow(() -> new NoSuchElementException("No hay números mayores que 10"));

            // Usar var para la inferencia de tipos en la variable resultado
            var mensaje = "El primer número mayor que 10 es: " + resultado;

            // Imprimir el resultado
            System.out.println(mensaje);
        }catch (NoSuchElementException exception){
            System.out.println(exception.getMessage());
        }
    }

}
