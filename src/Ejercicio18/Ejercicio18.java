package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    System.out.println(i != 3 ? i : "E");
                    System.out.println("-");
                    System.out.println(j != 3 ? j : "E");
                    System.out.println("-");
                    System.out.println(k != 3 ? k : "E");

                }
            }

        }
    }

}
