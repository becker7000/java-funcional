package mx.tecgurus.lambdas;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        // Los genericos siempre tienen que ser clases
        // Cuando tenemos 2 parametros, necesitamos paréntesis
        BiConsumer<String,Integer> consumidorBi = (nombre,edad) -> {
            System.out.print("\n\t Nombre: "+nombre);
            System.out.print("\n\t Edad: "+edad);
        };

        consumidorBi.accept("Pepe",24);

    }

}
