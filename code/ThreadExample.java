public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = Thread.currentThread();
        Thread thread2 = new Thread(()->{
            // Realizando alguna tarea costosa
            try{
                System.out.println("\n\t Iniciando cuenta de 5 segundos...");
                Thread.sleep(5000);
            }catch (InterruptedException exception){
                // WAITING
                System.out.println("\n\t Status: "+thread1.getState());

            }
        });

        thread2.start();
        thread2.join();

    }

}
