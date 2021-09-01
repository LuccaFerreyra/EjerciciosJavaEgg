
package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
     double F,C;
        System.out.println("Ingrese cantidad de grados celsius a convertir");
        C=leer.nextDouble();
        F = 32 + (9 * C / 5);
        System.out.println(C + " grados celsius equivalen a " + F + " grados farenheit");
    }
    
}
