package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String userText = "";
        int correctas = 0;
        int incorrectas = 0;

        // Bucle para la lectura de cadenas, mientras la entrada sea distinta a "&&&&&"
        while (!"&&&&&".equals(userText)) {
            System.out.println("Ingrese una cadena de texto: ");
            userText = leer.nextLine();
            userText = userText.toUpperCase();

            // Validamos que tenga un maximo de 5 caracteres
            if (userText.length() == 5) {
                // Validamos el primer y ultimo caracter sean igual a X y O respectivamente
                if (userText.substring(0, 1).equals("X") && (userText.substring(4, 5).equals("O"))) {
                    correctas++; // incrementa el contador en 1
                } else {
                    incorrectas++; // incrementa el contador en 1
                }

            } else {
                System.out.println("[ ERROR ] la cadena debe contener 5 caracteres.");
            }
        }

        // Mostramos el total de cadenas correctas
        System.out.println("[ INFORME ]");
        System.out.println("Se ingresaron un total de [" + correctas + "] cadenas correctas.");
        System.out.println("Se ingresaron un total de [" + (incorrectas - 1) + "] cadenas incorrectas.");
    }

}
