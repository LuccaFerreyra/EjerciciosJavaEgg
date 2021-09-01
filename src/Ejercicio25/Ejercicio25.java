
package Ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matriz [][] = new int[4][4];

        System.out.println("Ingrese la matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Matriz[" + i + "][" + j + "]):");
                matriz[i][j] = leer.nextInt();

            }
        }
            System.out.println("Matriz Original:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " ");

                }
                System.out.println("");
            }

            //Trannsponiendo la matriz
            int aux;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < i; j++) {
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;

                }
            }
            System.out.println("La matriz transpuesta es:");

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
    }
    
}
