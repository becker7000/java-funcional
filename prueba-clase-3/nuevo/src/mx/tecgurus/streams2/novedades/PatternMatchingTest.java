package mx.tecgurus.streams2.novedades;

public class PatternMatchingTest {

    public static void main(String[] args) {

        Object obj = "Hola";

        // Ejemplo de coincidencia de patrones con instanceof (Java 16+)
        if (obj instanceof String s && s.length() > 3) {
            System.out.println("La cadena tiene más de 3 caracteres: " + s);
        } else {
            System.out.println("No es una cadena válida.");
        }

    }

}
