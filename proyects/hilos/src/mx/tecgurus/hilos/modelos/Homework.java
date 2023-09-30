package mx.tecgurus.hilos.modelos;

public class Homework implements Runnable{

    private String nombre;

    public Homework(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {

        for(int i=1;i<=8;i++){
            System.out.printf("\n\t i: %d, hilo:%s",i,nombre);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
