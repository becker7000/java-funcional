package org.example.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExample {

    public static void main(String[] args) {

        // Crear un ExecutorService con 4 hilos
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Enviar tareas al ExecutorService
        executorService.submit(() -> {
            // Código de la tarea 1
            System.out.println("\n\t Tarea 1");
        });

        executorService.submit(() -> {
            // Código de la tarea 2
            System.out.println("\n\t Tarea 2");
        });

        // ... enviar más tareas ...
        executorService.submit(() -> {
            // Código de la tarea 2
            System.out.println("\n\t Tarea 3");
        });


        executorService.submit(() -> {
            // Código de la tarea 2
            System.out.println("\n\t Tarea 4");
        });

        // Apagar el ExecutorService cuando ya no se necesite
        executorService.shutdown();
    }

}
