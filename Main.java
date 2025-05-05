import java.util.Scanner;

import programas.opciones;
import vistas.vista;

public class Main {
    public static void main(String[] args) {
        
        Scanner menu = new Scanner(System.in);
    int opcion;
    vistas.vista.banner();
        do {
          programas.opciones.opcion();
            System.out.println("[0]salir");
            System.out.print("[?]");
          
            opcion = menu.nextInt();

            // Opciones 
            switch (opcion) {
                case 1:
                System.out.println("------------------");
        programas.Sumar.sumar();
                System.out.println("------------------");  
                    break;

                case 2:
                System.out.println("------------------");
                programas.Resta.restar();
                System.out.println("------------------");  
                    break;

                    case 3:
                System.out.println("------------------");
                programas.Multiplicacion.multiplicar();
                System.out.println("------------------");  
                    break;

                    case 4:
                System.out.println("------------------");
                programas.Division.dividir();
                System.out.println("------------------");  
                    break;

                    case 5:
                System.out.println("------------------");
                programas.Modulo.modulo();
                System.out.println("------------------");  
                    break;

                    case 6:
                System.out.println("------------------");
                programas.Promedio3.promedio3();
                System.out.println("------------------");  
                    break;

                    case 7:
                System.out.println("------------------");
                programas.MayorMenor2.mayorMenor2();
                System.out.println("------------------");  
                    break;

                    case 8:
                System.out.println("------------------");
                programas.MayorMenor3.MayorMenor3();
                System.out.println("------------------");  
                    break;

                    case 9:
                System.out.println("------------------");
                programas.KmAm.kmAm();
                System.out.println("------------------");  
                    break;

                    case 10:
                System.out.println("------------------");  
                programas.KgAg.kgAg();
                System.out.println("------------------");
                    break;

           default:
                break;
            }
       
        } while (opcion != 0);
            
        
    }
}