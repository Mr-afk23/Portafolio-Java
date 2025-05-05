package programas;

public class KmAm {
    public static void kmAm() {
        double km, am;
        Scanner menu = new Scanner(System.in);
        System.out.println(" distancia en m");
        int distancia = menu.nextInt();
        int conversion = distancia / 1000;
        System.out.println("La distancia en km es: " + conversion); 
    }
}
