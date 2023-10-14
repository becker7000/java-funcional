package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class SimpleWebServerExample {

    public static void main(String[] args) throws IOException {
        // Crear una instancia del servidor HTTP
        HttpServer server = HttpServer.create();

        // Enlazar el servidor a todas las interfaces de red en el puerto 8080
        server.bind(new InetSocketAddress("0.0.0.0", 8080), 0);

        // Crear un contexto para la ruta "/hello" y asignar un manejador para esa ruta
        server.createContext("/hello", new MyHandler());

        // Iniciar el servidor
        server.start();

        // Mostrar un mensaje indicando que el servidor se ha iniciado
        System.out.println("Servidor HTTP iniciado en el puerto 8080");
    }

    // Clase interna que implementa HttpHandler para manejar las solicitudes HTTP
    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            // Respuesta que se enviará al navegador (una página HTML)
            String response = "<html><body><h1>¡Hola desde el servidor en el navegador!</h1></body></html>";

            // Configurar las cabeceras de la respuesta
            t.getResponseHeaders().set("Content-Type", "text/html");

            // Convertir la respuesta a bytes usando la codificación UTF-8
            byte[] responseBytes = response.getBytes("UTF-8");

            // Enviar la respuesta al navegador junto con el código de estado 200 (OK)
            t.sendResponseHeaders(200, responseBytes.length);

            // Obtener el flujo de salida de la respuesta y escribir los bytes de la respuesta
            OutputStream os = t.getResponseBody();
            os.write(responseBytes);

            // Cerrar el flujo de salida para finalizar la respuesta
            os.close();
        }
    }
}
