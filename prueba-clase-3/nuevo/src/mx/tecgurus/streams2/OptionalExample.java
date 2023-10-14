package mx.tecgurus.streams2;

import mx.tecgurus.streams2.modelos.Usuario;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        // Probar varios correos
        usuario.setCorreo("holaPeter@gmail.com");

        // Se obtiene un objeto que posiblemente podría ser nulo:
        Optional<String> correoOptional = Optional.ofNullable(usuario.getCorreo());

        // Filter devuelve un Opcional<String> o ejecuta orElse
        String mensaje = correoOptional
                .filter(correo -> correo.contains("@"))
                .orElse("Correo electrónico sin @ o nulo");

        /*
            orElse para proporcionar un mensaje predeterminado
            ("Correo electrónico inválido") en caso de que el Optional
            esté vacío, es decir, si el correo electrónico no es válido
            según nuestra condición de filtro.
        */

        System.out.println(mensaje);

    }

}
