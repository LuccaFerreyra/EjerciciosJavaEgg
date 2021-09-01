package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena;
        System.out.println("ingrese palabra de 8 letras");
        cadena = leer.next();
        if (cadena.length() <= 8) {

            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }
    }

}
