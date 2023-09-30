package mx.tecgurus.lambdas;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

public class SimuladorVolados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("\n\t Cuantos volados: ");
        num = Integer.parseInt(entrada.nextLine());

        Consumer<Integer> mis_volados = num_vol -> {

            Random aleatorio = new Random();
            for(int i=0;i<num_vol;i++){
                int moneda = aleatorio.nextInt(0,2);
                if(moneda==0){
                    System.out.println("\n\t SOOOOL");
                }else{
                    System.out.println("\n\t AGUILA");
                }
            }

        };

        mis_volados.accept(num);

        entrada.close();

    }

}
