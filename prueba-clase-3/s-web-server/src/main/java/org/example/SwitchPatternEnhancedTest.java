package org.example;

public class SwitchPatternEnhancedTest {

    public static void main(String[] args) {

        Object obj = "hola";

        // Ejemplo de switch con patrones mejorados (Java 18+)
        switch (obj) {
            case String s -> System.out.println("Es una cadena: " + s);
            default -> System.out.println("No coincide con ningún patrón.");
        }

    }

}
