package programas;

import java.util.Scanner;

public class MayorMenor3 {
    
public static void MayorMenor3(){
    Scanner menu = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
                int num16 = menu.nextInt();
                System.out.println("Ingrese el segundo numero");
                int num17 = menu.nextInt();
                System.out.println("Ingrese el tercer numero");
                int num18 = menu.nextInt();
                if (num16 > num17 && num16 > num18){
                    System.out.println("El numero mayor es: " + num16);
                    System.out.println("El numero menor es: " + num17);
                } else {
                    if (num17 > num16 && num17 > num18){
                        System.out.println("El numero mayor es: " + num17);
                        System.out.println("El numero menor es: " + num16);
                    } else {
                        System.out.println("El numero mayor es: " + num18);
                        System.out.println("El numero menor es: " + num16);
                }
                    
                }
}
}
