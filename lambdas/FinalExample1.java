package mx.tecgurus.lambdas;

import java.util.Scanner;
import java.util.function.Function;

public class FinalExample1 {

    public static void main(String[] args) {

        // Usando Function para crear una lambda que elimine espacios
        Function<String,String> eliminarEspacios = cadena -> cadena.replaceAll(" ","");

        // Solicitamos algunos dartos para poder provar nuestra función
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe un texto: ");
        String texto = entrada.nextLine();
        String texto_sin_espacios = eliminarEspacios.apply(texto);

        // Usando los text blocks para poder
        System.out.printf(
                """
                    Texto de entrada: %s
                    Texto sin espacios: %s
                """,texto,texto_sin_espacios);

        entrada.close();

    }

}
