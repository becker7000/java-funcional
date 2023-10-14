package mx.tecgurus.streams2.novedades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCurpTest {

    public static void main(String[] args) {

        // Expresión regular para validar una CURP mexicana

        String regex = "[A-Z]{4}[0-9]{6}[HM]{1}[A-Z]{2}[A-Z]{3}[0-9]{2}";

        // CURP a ser validada
        String curp = "ABCD123456HCMXZNA12";

        // Crear el objeto Pattern
        Pattern pattern = Pattern.compile(regex);

        // Crear el objeto Matcher
        Matcher matcher = pattern.matcher(curp);

        // Verificar si la CURP coincide con el patrón
        if (matcher.matches()) {
            System.out.println("La CURP es válida.");
        } else {
            System.out.println("La CURP no es válida.");
        }

    }

}
