
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Este ess otro MAIN!!");
        System.out.println("pido dos numero y muestro la suma ");
        int num =leer.nextInt();
        int num2 =leer.nextInt();
        /// Otro metodo
        int suma = num+num2;
        ///
        System.out.println("suma:"+(num+num2));
    }
    
}
