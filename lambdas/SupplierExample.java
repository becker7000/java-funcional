package mx.tecgurus.lambdas;

import javax.swing.*;
import java.util.function.Supplier;

public class SupplierExample {

    public static String generarCodigoAlfanumerico(int longitud){

        // Metemos en una cadena los caracteres que queremos que conformen el código.
        String caracteres = "ABCDEFGHIJK1234567890";

        // Supplier no recibe nada pero si puede retornar algún valor.
        Supplier<Character> caracterAleatorio =
                () -> caracteres.charAt((int)(Math.random()*caracteres.length()));

        // Creamos un objeto constructor de cadenas.
        StringBuilder codigo = new StringBuilder();

        // Vamos agregando
        for(int i=0;i<longitud;i++){
            codigo.append(caracterAleatorio.get());
        }

        // Transformamos el objeto de StringBuilder a String
        return codigo.toString();

    }

    public static void main(String[] args) {

        int longitud=0;

        try {

            longitud = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos carácteres? "));
            String nuevoCodigo = generarCodigoAlfanumerico(longitud);
            JOptionPane.showMessageDialog(
                    null,
                    "Código generado: "+nuevoCodigo,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE
            );

        }catch (NumberFormatException exception){ // Si el dato no es un número se lanza un error

            JOptionPane.showMessageDialog(
                    null,
                    "Error, la entrada debe ser numérica",
                    "Error de formato",
                    JOptionPane.ERROR_MESSAGE
            );

        }

    }

}
