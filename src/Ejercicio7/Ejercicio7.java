
package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Numero1;
        int Numero2 = 0;
        System.out.println("Dame el primer numero");
        Numero1 = leer.nextInt();
        if (Numero1 > Numero2) {

            System.out.println(Numero1 + " es mayor que" + Numero2);
        } else {
            System.out.println(Numero2 + " es mayor que" + Numero1);
        }
    }

}
