package mx.tecgurus.lambdas;

import mx.tecgurus.lambdas.modelos.AnalizadorCadena;

import java.util.function.Consumer;

public class InterfazFuncionalExtra {

    // Método configurado para recibir una lambda
    public static void ejecutarAnalisis(String cadena, AnalizadorCadena analizador){
        analizador.analizar(cadena);
    }

    public static void main(String[] args) {

        String mensaje ="Hola";
        Consumer<String> imprimir = System.out::println;

        imprimir.accept("Cadena a analizar: "+mensaje);

        // Pasando una lambda como parametro:
        ejecutarAnalisis(
                mensaje,
                cadena -> imprimir.accept("Número de caracteres: "+cadena.length())
        );

        // Otro ejemplo para la inicial de la cadena:

        ejecutarAnalisis(
                mensaje,
                cadena -> imprimir.accept("Letra inicial: "+cadena.charAt(0))
        );

        // Ejemplo para la letra final de una cadena:
        ejecutarAnalisis(
                mensaje,
                cadena -> imprimir.accept("Letra final: "+cadena.charAt(cadena.length()-1))
        );

    }

}
