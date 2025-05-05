package programas;
import java.util.Scanner;
public class Promedio3 {
    
public static void promedio3(){
    Scanner scanNumeros = new Scanner(System.in);
    System.out.print("num1");
    double num1 = scanNumeros.nextDouble();

    System.out.print("num2");
    double num2 = scanNumeros.nextDouble();

    System.out.print("[n3]");
    double num3 = scanNumeros.nextDouble();

    System.out.print("[Re]: " + ((num1+num2+num3)/3));
}
}
