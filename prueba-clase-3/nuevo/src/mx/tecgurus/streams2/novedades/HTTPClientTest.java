package mx.tecgurus.streams2.novedades;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


//JAVA 11
public class HTTPClientTest {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Consultado datos de una API con HttpClient

        // Creamos un objeto HttpClient (Cliente)
        // Similar a lo que hicimos con CalculadoraIVAService
        HttpClient httpClient = HttpClient.newHttpClient();

        // Creamos un objeto solicitud con el contructor newBuilder():
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .build(); // Se termina de contruir

        // La respuesta se guarda como un HttpResponse de tipo String
        // el método send envía la solicitud y se recibe como un String
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // Se muestra el String recibido
        System.out.println("Response Body: " + response.body());

    }

}
