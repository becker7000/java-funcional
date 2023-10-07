package mx.tecgurus.streams;

import mx.tecgurus.streams.modelos.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsuarioMapTest {

    public static void main(String[] args) throws InterruptedException {

        Stream<User> nombres = Stream.of(
                "Laura 5501928374",
                "Javier 5612345678",
                "Roberto 5601928374",
                "Ana 5677665588",
                "Julia 5516254333")
                .map( nombre -> new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(user -> System.out.println(user.getNombre()))
                .map(user -> {
                    String nombre = user.getNombre().toUpperCase();
                    user.setNombre(nombre);
                    return user;
                });

        List<User> usuarios = nombres.collect(Collectors.toList());
        usuarios.forEach(System.out::println);

    }

}
