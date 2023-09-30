package mx.tecgurus.lambdas;

import mx.tecgurus.lambdas.servicios.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        // Expresión lambda para sumar con interfaz funcional
        Calculadora suma = (a,b) -> a+b;
        System.out.println("\n\t Suma: "+suma.operacion(3.14,2.71));

        // Expresión lambda para multiplicar con la misma interfaz funcional
        Calculadora multiplacion = (a,b) -> a*b;
        System.out.println("\n\t Multiplicación: "+multiplacion.operacion(11.7,76.9));

    }

}
