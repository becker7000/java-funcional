package mx.tecgurus.streams2.novedades;

public class SwitchEnhancedExample {

    public static void main(String[] args) {

        String dia = "Martes";

        // Ejemplo de Switch con expresiones lambda (Java 12+)
        switch (dia) {
            case "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" -> System.out.println("Es un día laboral");
            case "Sábado", "Domingo" -> System.out.println("Es un fin de semana");
            default -> System.out.println("Día no válido");
        }

    }

}
