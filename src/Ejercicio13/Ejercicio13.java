
package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Nota;
        System.out.println("Ingrese Nota del 1 al 10");
        Nota = leer.nextInt();

        switch (Nota) {
            case 1:
                System.out.println("CORRECTO");
                break;

            case 2:
                System.out.println("CORRECTO");
                break;

            case 3:
                System.out.println("CORRECTO");
                break;

            case 4:
                System.out.println("CORRECTO");
                break;
            case 5:
                System.out.println("CORRECTO");
                break;

            case 6:
                System.out.println("CORRECTO");
                break;
            case 7:
                System.out.println("CORRECTO");
                break;
            case 8:
                System.out.println("CORRECTO");
                break;
            case 9:
                System.out.println("CORRECTO");
                break;
            case 10:
                System.out.println("CORRECTO");
                break;
                
            default:System.out.println("Ingrese nota del 1 al 10");
                Nota = leer.nextInt();
                break;
        }
    }
    
}
