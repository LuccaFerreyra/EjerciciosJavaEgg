
package Ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 4 numeros ");
        int n=0;
        int n1=0;
        int n2=0;
        int n3=0;
        int n4=0;
        
    n= leer.nextInt();
    n2= leer.nextInt();
    n3= leer.nextInt();
    n4= leer.nextInt();
 
    if (n<=20) {
         System.out.print(n);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");
 
 
    } System.out.println(" ");
    if (n2<=20) {
        System.out.print(n2);
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    }System.out.println(" ");
    if (n3<=20) {
        System.out.print(n3);
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
 
    }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    } System.out.println(" ");
    if (n4<=20) {
        System.out.print(n4);
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
 
    }
    }else {
        System.out.print("El numero ingresado es invalido");
 
    }
 
 
 
    System.out.println(" ");
    }
    
}
