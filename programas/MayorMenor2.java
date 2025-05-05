package programas;
import java.util.Scanner;

public class MayorMenor2 {
    
    public static void mayorMenor2(){
                Scanner menu = new Scanner(System.in);
                System.out.println("Ingrese el primer numero");
                int num14 = menu.nextInt();
                System.out.println("Ingrese el segundo numero");
                int num15 = menu.nextInt();
                if (num14 > num15){
                    System.out.println("El numero mayor es: " + num14);
                    System.out.println("El numero menor es: " + num15);
                }  else {
                    System.out.println("El numero mayor es: " + num15);
                    System.out.println("El numero menor es: " + num14);
                    
                }
    }
}
