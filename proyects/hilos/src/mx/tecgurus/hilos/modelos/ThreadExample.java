package mx.tecgurus.hilos.modelos;

public class ThreadExample extends Thread{

    public ThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() { // Ejecuta el hilo
        System.out.println("\n\t Nombre: "+this.getName());

        System.out.print("\n\t Alfabeto \n\t");
        for (char letra = 'A'; letra<='Z'; letra++){
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(letra);
        }

        System.out.println("\n\n\t Fin del proceso...");

    }
}
