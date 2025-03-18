import java.util.Scanner;

public class Portafolio {
    public static void main(String[] args) {
        
        Scanner menu = new Scanner(System.in);
    int opcion;
        do {

System.out.println("\n\n");
System.out.println("Bienvenidos a mi alvarito java [Alvarito Boy Version 1.0]");


            System.out.println("    _    _                 _ _          _                 ");
            System.out.println("   / \\  | |_   ____ _ _ __(_) |_ ___   | |__   ___  _   _ ");
            System.out.println("  / _ \\ | \\ \\ / / _` | '__| | __/ _ \\  | '_ \\ / _ \\| | | |");
            System.out.println(" / ___ \\| |\\ V / (_| | |  | | || (_) | | |_) | (_) | |_| |");
            System.out.println("/_/   \\_\\_| \\_/ \\__,_|_|  |_|\\__\\___/  |_.__/ \\___/ \\__, |");
            System.out.println("                                                    |___/ ");
            System.out.println("");
            System.out.println("");

    System.out.println("[?] Selecciona una opcion para continuar");
    System.out.println("Proyecto iniciado -----> Mar 18 8:50 am 2025");
    System.out.println("");



            //menu 

            System.out.println("[1] la suma de 2 numeros");
            System.out.println("[2]opcion 2");
            System.out.println("[3]opcion 3");
            System.out.println("[4]salir");
            System.out.print("[?]");
          
            opcion = menu.nextInt();

            // Opciones 
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero");
                    int num1 = menu.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    int num2 = menu.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma de los numeros es: " + suma);
                    break;
           default:
                break;
            }
       
        } while (opcion != 0);
            
        
    }
}