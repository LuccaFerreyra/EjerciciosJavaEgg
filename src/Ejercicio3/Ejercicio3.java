
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra = " ";
        System.out.println("Ingrese frase");
        String frase=leer.next();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
