package mx.tecgurus.hilos;

public class HomeworkThreadLambdaTest {

    public static void main(String[] args) throws InterruptedException {

        Thread principal = Thread.currentThread();

        // Transformado a lambda, que equivale a una interfaz funcional con el método run
        Runnable iHomework = () -> {
            for(int i=1;i<=8;i++){
                System.out.printf("\n\t i: %d, hilo:%s",i,Thread.currentThread().getName());
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("\n\t Status: "+principal.getState());
            }
        };

        // Estos threads se ejecutan de forma asincrona
        // en forma paralela
        // Atajo para volver variables: ctrl + alt + v

        Thread thread1 = new Thread(iHomework, "Correr");
        thread1.start();

        Thread thread2 = new Thread(iHomework, "Comer");
        thread2.start();

        Thread thread3 = new Thread(iHomework, "Estudiar");
        thread3.start();

        Thread thread4 = new Thread(iHomework, "Dormir");
        thread4.start();


        // Deja pasar un tiempo a partir de que se inician las ejecuciones
        // de los hilos entonces continua la ejecución del hilo principal
        // ADEMÁS: sleep es estático se ejecuta sobre la instancia del hilo actual

//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // El programa va a esperar a ejecutar las siguientes
        // intrucciones hasta el hilo al que se le aplica join
        // haya terminado
        // join se aplica a hilo por hilo.

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("\n\t Continua con la ejecución...");

    }

}
