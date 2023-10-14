package com.example.aplicacion;

import com.example.calculadora.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(5, 3);
        System.out.println("Resultado de la suma: " + resultado);

    }

}
