package Bucles;
import java.util.Scanner;
import java.util.Random;

public class Bucles_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecret = random.nextInt(100) + 1; 
        int intents = 0;
        int min = 1;
        int max = 100;
        int numeroEntrat = 0;
        
        System.out.println("Endevina el número secret entre 1 i 100.");


        while (numeroEntrat != numeroSecret) {
            System.out.printf("Introdueix un número entre %d i %d: ", min, max);
            
            if (in.hasNextInt()) {
                numeroEntrat = in.nextInt();
                
                if (numeroEntrat < min) {
                    System.out.println("El número entrat està fora de rang.");
                } else if (numeroEntrat > max) {
                    System.out.println("El número entrat està fora de rang.");
                } else if (numeroEntrat < numeroSecret) {
                    System.out.println("El número secret és major.");
                    min = numeroEntrat + 1; 
                } else if (numeroEntrat > numeroSecret) {
                    System.out.println("El número secret és menor.");
                    max = numeroEntrat - 1; 
                } else {
                    System.out.printf("Enhorabona! Has encertat el número secret en %d intents.%n", intents);
                }
            } else {
                System.out.println("Si us plau, introdueix un número enter.");
                in.next(); 
            }
                
                intents++; 
                

        }
        
        in.close();
    }
}
