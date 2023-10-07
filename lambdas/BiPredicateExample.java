package mx.tecgurus.lambdas;

import mx.tecgurus.lambdas.modelos.Producto;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        // Tenemos la optician de pasarle 2 objetos genericos:
        // BiPredicate<String,String> test_bp = (a,b)-> a.equals(b);
        BiPredicate<String,String> test_bp = String::equals;

        // Guardamos el valor booleano
        boolean result = test_bp.test("hola","bye");

        // Mostramos el valor booleano
        System.out.printf("\n\t Resultado: %b",result);

        // Crear Producto ( 10 min)

        // Otro ejemplo:
        BiPredicate<Producto,Producto> son_iguales = (a,b) -> a.equals(b);
        Producto p1 = new Producto(1,"Coca cola",20.1);
        Producto p2 = new Producto(1,"Coca cola",20.1);

        // Comparamos 2 productos para ver si están duplicados
        boolean comparacion = son_iguales.test(p1,p2);

        System.out.printf("\n\t ¿Los productos son iguales? %b",comparacion);


    }

}
