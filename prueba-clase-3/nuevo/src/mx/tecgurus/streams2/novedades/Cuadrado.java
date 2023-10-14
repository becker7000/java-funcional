package mx.tecgurus.streams2.novedades;

// JAVA 15
public final class Cuadrado implements Forma {

    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

}
