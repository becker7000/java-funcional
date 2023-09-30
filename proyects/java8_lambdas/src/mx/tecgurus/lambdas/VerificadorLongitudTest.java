package mx.tecgurus.lambdas;

import mx.tecgurus.lambdas.servicios.VerificadorLongitud;

public class VerificadorLongitudTest {

    public static void main(String[] args) {

        // Expresión lambda para verificar si una cadena tiene una longitud especifica
        VerificadorLongitud verficador = ((cadena, longitud) -> cadena.length() == longitud );

        // Usando la configuración de la interfaz
        System.out.print("\n\t Resultado: "+verficador.verificar("Erick",5));
        System.out.print("\n\t Resultado: "+verficador.verificar("Pepe",3));

    }

}
