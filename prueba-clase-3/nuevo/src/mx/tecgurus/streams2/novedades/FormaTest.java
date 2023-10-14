package mx.tecgurus.streams2.novedades;

public class FormaTest {

    public static void main(String[] args) {

        Forma forma1 = new Circulo(5.8);
        Forma forma2 = new Cuadrado(10);

        System.out.printf("\n\t Área del círculo: %.2f",forma1.area());
        System.out.printf("\n\t Área del cuadrado: %.2f",forma2.area());

    }

}
