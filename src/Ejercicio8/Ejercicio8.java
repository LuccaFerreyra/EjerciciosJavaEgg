package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 100;
        if (num % 2 == 0) {
            System.out.println("El numero es par");

        } else {
            System.out.println("El numero es impar");
        }
    }

}
