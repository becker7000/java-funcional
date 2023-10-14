package mx.tecgurus.streams2.novedades;

import mx.tecgurus.streams2.modelos.LibroRecord;

// JAVA 14
public class LibroRecordTest {

    public static void main(String[] args) {

        // Una vez que se crea un record no puede ser modificado
        LibroRecord libro = new LibroRecord("El llano en llamas","Juan Rulfo");

        System.out.printf("\n\t Nombre: %s",libro.nombre());
        System.out.printf("\n\t Autor: %s",libro.autor());

        // Mejoran la facilidad de uso
        // Son simples, inmutables, legibilidad de código, se usan en API's

    }

}
