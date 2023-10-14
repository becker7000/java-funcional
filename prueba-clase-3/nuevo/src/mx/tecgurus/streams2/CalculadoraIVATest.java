package mx.tecgurus.streams2;

import mx.tecgurus.streams2.servicios.CalculadoraIVAService;

public class CalculadoraIVATest {

    public static void main(String[] args) {

        // Obtener una instancia de la interfaz funcional con el método privado
        CalculadoraIVAService calculadoraIVA = CalculadoraIVAService.obtenerCalculadoraIVA();

        // Precio del producto
        double precioProducto = 100.0;

        // Cálculo del IVA utilizando el método de la interfaz funcional
        double iva = calculadoraIVA.calcularIVA(precioProducto);

        // Mostrar el resultado
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("IVA (16%): $" + iva);
        System.out.println("Precio total con IVA: $" + (precioProducto + iva));

    }

}
