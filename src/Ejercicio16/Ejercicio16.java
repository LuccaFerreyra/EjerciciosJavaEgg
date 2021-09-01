package Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 0;
        int suma = 0;

        do {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            suma = suma + num;
        } while (num != 0);
        System.out.println("La suma de todos los numeros es:" + suma);

    }

}
