package mx.tecgurus.streams;

import mx.tecgurus.streams.modelos.Producto;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductoPeekTest {

    public static void main(String[] args) {

        // Creamos una lista filtrada a través de una lista completa
        List<Producto> productos = Stream.of(
                new Producto("Oreo",19.49),
                new Producto("Sabritas",34.89),
                new Producto("Donitas",17.84),
                new Producto("Red bull",55.49),
                new Producto("Boing",18.99)
                ).peek(producto -> System.out.println("\nProcesando producto: "+producto))
                .filter(producto -> producto.getPrecio()>20.00)
                .peek(producto -> System.out.println("\nProducto caro encontrado: "+producto))
                .collect(Collectors.toList());

        // Mostramos la lista guardada:
        System.out.println("\n\nProductos caros encontrados: ");
        productos.forEach(System.out::println);

        // findFirst() es un operador final
        // Optional lo abordaremos a fondo más adelante
        Optional<Producto> producto_especial = productos.stream().findFirst();
        System.out.println("\nProducto encontrado 1:"+producto_especial.get());

        // También podemos aplicarlo de esta forma
        Producto producto_unico = productos
                .stream()
                .filter(producto -> producto.getNombre().charAt(0)=='S')
                .findFirst().get();
        System.out.println("\nProducto encontrado 2: "+producto_unico);

    }

}
