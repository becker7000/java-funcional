package mx.tecgurus.streams2.novedades;

// JAVA 15
public final class Circulo implements Forma {

    private final double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

}
