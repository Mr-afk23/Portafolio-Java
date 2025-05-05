package programas;
import java.util.Scanner;

public class Multiplicacion {
    
    public static void multiplicar(){
        Scanner scanNumeros = new Scanner(System.in);
        System.out.print("[n1]");
        double n1 = scanNumeros.nextDouble();

        System.out.print("[n2]");
        double n2 = scanNumeros.nextDouble();

        System.out.print("[Re]: " + (n1*n2));
    }
}
