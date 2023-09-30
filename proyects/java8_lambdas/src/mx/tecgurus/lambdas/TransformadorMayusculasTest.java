package mx.tecgurus.lambdas;

import mx.tecgurus.lambdas.servicios.TransformadorMayusculas;

import java.util.Locale;

public class TransformadorMayusculasTest {

    public static void main(String[] args) {

        String cadena1 = "canada";
        String cadena2 = "ESPAÑA";

        // Asignando configuración a una interfaz funcional con una expresión lambda
        TransformadorMayusculas transformador = cadena -> cadena.toUpperCase(Locale.ROOT);
        System.out.printf("\n\t Transformando %s a %s",cadena1,transformador.transformar(cadena1));

        // Se le puede cambiar la configuración a una interfaz funcional
        transformador = cadena -> cadena.toLowerCase(Locale.ROOT);
        System.out.printf("\n\t Transformando %s a %s",cadena2,transformador.transformar(cadena2));

    }

}
