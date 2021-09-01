
package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
     double num;
     System.out.println("Ingrese un numero");
     num =leer.nextDouble();
        System.out.println(num*2);
        System.out.println(num*3); 
        double resultado= Math.sqrt(num);
        System.out.println(" La raiz cuadrada es " + resultado );
    }
    
}
