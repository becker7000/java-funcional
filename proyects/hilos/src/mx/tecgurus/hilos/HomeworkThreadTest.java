package mx.tecgurus.hilos;

import mx.tecgurus.hilos.modelos.Homework;

public class HomeworkThreadTest {

    public static void main(String[] args) {

        new Thread(new Homework("Correr")).start();
        new Thread(new Homework("Estudiar")).start();
        new Thread(new Homework("Ir de compras")).start();
        new Thread(new Homework("Programar")).start();

    }

}
