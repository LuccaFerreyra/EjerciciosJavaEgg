package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //TIPOS DE DATOS - DEFINIR
        int num = 0;//TIPO ENTERO
        double numReal = 0.0; //TIPO REAL
        String cadena = "hola mundo"; //TIPO CADENA
        char caracter = 'A'; //TIPO CARACTER
        boolean logico = true; // O falso ///TIPO LOGICO

        /// ESCRIBIR
        System.out.println("El texto que quiero mostrar:" + cadena);

        ///LEER 
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); /// Lee con salto de linea

        System.out.println("Ingresar una cadena de texto!");
        String palabra = leer.next();///leer cadena 

        ///Lee el Numero 
        System.out.println("Ingresar un numero!");
        num = leer.nextInt();
        System.out.println("numero:" + num);

        ///Lee numero con decimal
        System.out.println("Ingrese un numero real");
        numReal = leer.nextDouble();
        System.out.println("real:" + numReal);

        ///Leer falso o verdadero
        System.out.println("Ingrese booleano");
        logico = leer.nextBoolean();
        System.out.println("logico:" + logico);

        System.out.println("Ingresar un caracter");
        caracter = leer.next().charAt(0);
        System.out.println("caracter:" + caracter);
    }

}
