package programas;
import java.util.Scanner;

public class Division {
    public static void dividir() {
        Scanner scanNumeros = new Scanner(System.in);
        System.out.print("num1 :");
        double num1 = scanNumeros.nextDouble();

        System.out.print("num2 :");
        double num2 = scanNumeros.nextDouble();

        if (num2 == 0) {
            System.out.println("Error al dividir ");
        } else {
            System.out.print("[Re]: " + (num1 / num2));
        }
        if (num1 == 0) {
            System.out.println("Error al dividir ");
        } else {
            System.out.print("[Re]: " + (num2 / num1));
        }
    }
}
