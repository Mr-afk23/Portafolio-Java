package programas;

public class opciones {
  static  String lista [] = {
        "la suma de 2 numeros",
        "la resta de 2 numeros",
        "la multiplicacion de 2 numeros",
        "la division de 2 numeros",
        "Modulo (residuo de 2 numeros)",
        "Promedio de 3 numeros",
        "Numero mayor y numero menor entre 2 numeros",
        "Numero mayor y numero menor entre 3 numeros",
        "Conversion de metros a centimetros",
        "Convercion de kilogramos a gramos",
    };


    public static void opcion() {

for (int i = 0; i < lista.length; i++) {
    System.out.println("["+ (i+1) +"] "+ lista[i]);
    
}
    }
    
}
