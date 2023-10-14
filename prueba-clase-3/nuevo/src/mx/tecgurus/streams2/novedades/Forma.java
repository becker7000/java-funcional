package mx.tecgurus.streams2.novedades;

// JAVA 15
sealed interface Forma permits Circulo, Cuadrado {

    double area();

}
