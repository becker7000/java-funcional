package mx.tecgurus.lambdas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // Si la función lleva más sentencias, entonces usamos llaves.
        // Cuando es un solo argumento podemos omitir los paréntesis
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        // Lambda básica de orden superior
        consumidor.accept(new Date());

    }

}
