package Ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;
        System.out.println("Ingrese el numero de filas");
        nFilas = leer.nextInt();
        System.out.println("Ingrese el numero de columnas");
        nCol = leer.nextInt();
        matriz = new int[nFilas][nCol];
        System.out.println("Ingrese una matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]:");
                matriz[i][j] = leer.nextInt();

            }

        }

        if (nFilas == nCol) {
            int i, j;
            i = 0;
            while (i < nFilas && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;

                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                System.out.println("La matriz es simetrica");

            }

        } else {
            System.out.println("La matriz no es simetrica");

        }
    }

}
