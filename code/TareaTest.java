public class TareaTest {

    public static void main(String[] args) {

        Thread mi_tarea = new Thread(new Tarea());
        mi_tarea.start();

        Runnable runnable = new Tarea();
        Thread t = new Thread(runnable);
        System.out.println("\n\t Status: "+t.getState()); // NEW
        t.start();
        System.out.println("\n\t Status: "+t.getState());


    }

}
