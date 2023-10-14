package mx.tecgurus.streams2.servicios;

public interface CalculadoraIVAService {

    double calcularIVA(double precio);

    // Método privado para calcular el IVA del 16%
    private static double calcularIVA16(double precio) {
        return precio * 0.16;
    }

    // Método estático público para obtener una instancia de la interfaz funcional con el método privado
    static CalculadoraIVAService obtenerCalculadoraIVA() {
        return precio -> calcularIVA16(precio);
    }

}
