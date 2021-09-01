package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int ValorInicial;
        int Numero1;
        int Numero2;

        System.out.println("Ingrese numero Inicial");
        ValorInicial = leer.nextInt();

        System.out.println("Ingrese primer numero");
        Numero1 = leer.nextInt();

        System.out.println("Ingrese segundo numero");
        Numero2 = leer.nextInt();

        if (Numero1 + Numero2 >= ValorInicial) {

            System.out.println("CORRECTO");
        } else {

            if (Numero1 + Numero2 <= ValorInicial) {
                System.out.println("Incorrecto Intente Nuevamente");
            }
        }
    }

}
