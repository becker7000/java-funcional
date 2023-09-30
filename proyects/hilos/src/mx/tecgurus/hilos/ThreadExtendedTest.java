package mx.tecgurus.hilos;

import mx.tecgurus.hilos.modelos.ThreadExample;

public class ThreadExtendedTest{

    public static void main(String[] args) throws InterruptedException {

        ThreadExample nuevo_hilo = new ThreadExample("Alfabeto");
        //System.out.println("\n\t Status: "+nuevo_hilo.getState());
        nuevo_hilo.start();

        ThreadExample nuevo_hilo2 = new ThreadExample("Otro alfabeto");
        nuevo_hilo2.start();

        System.out.println("\n\t Status: "+nuevo_hilo.getState());
        System.out.println("\n\t Status: "+nuevo_hilo2.getState());

    }

}
