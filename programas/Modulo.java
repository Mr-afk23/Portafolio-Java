package programas;

import java.util.Scanner;

public class Modulo {
    public static void modulo() {
    
     Scanner scanNumeros = new Scanner(System.in);
     System.out.println("num1");
        double num1 = scanNumeros.nextDouble();
        System.out.print("num2 :");
        double num2 = scanNumeros.nextDouble();
        System.out.print("[Re]: " + (num2 % num1));
     }

}
