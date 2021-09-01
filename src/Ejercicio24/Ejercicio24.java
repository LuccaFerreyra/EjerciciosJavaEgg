package Ejercicio24;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n, cifras;
        char car;
        do {
            System.out.print("Introduce un número entero: ");
            n = leer.nextInt();
            cifras = 1;    //esta variable es el contador de cifras
            while (n != 0) {             //mientras a n le queden cifras
                n = n / 10;         //le quitamos el último dígito
                cifras++;          //sumamos 1 al contador de cifras
            }
            System.out.println("El número tiene " + cifras + " cifras");
            System.out.print("Continuar? ");
            car = (char) System.in.read();

        } while (car != 'n' && car != 'N');
    }

}
