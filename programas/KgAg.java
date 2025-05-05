package programas;
import java.util.Scanner;

public class KgAg {
    public static void kgAg() {
        double kg , g;
        Scanner menu = new Scanner(System.in);
        System.out.println("Introduce el peso en kilogramos:");
        kg = menu.nextDouble();
        g = kg * 1000;
        System.out.println("El peso en gramos es: " + g);
    }
}