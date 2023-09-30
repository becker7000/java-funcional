package mx.tecgurus.lambdas;

public class InterfaceFunctionalExample {

    interface GeneradorSaludo {
        String generarSaludo(String nombre);
    }

    public static void main(String[] args) {
        // Expresión lambda para generar un saludo personalizado
        GeneradorSaludo generadorSaludo = nombre -> "Bienvenid@ " + nombre + "!";
        System.out.println(generadorSaludo.generarSaludo("Juan"));
    }

}
