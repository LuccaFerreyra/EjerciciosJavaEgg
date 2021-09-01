package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Numero1;
        int Numero2;
        double calculo;
        int Opcion = 0;
        int Bandera = 0;

        /// llenamos el primer numero
        System.out.println("Ingrese primer número:");
        Numero1 = leer.nextInt();

        /// llenamos el segundo numero
        System.out.println("Ingrese el segundo número:");
        Numero2 = leer.nextInt();
        //entrada.close(); // cerramos la entrada de datos 

        /// entramos al bucle mientras sea cero
        while (Bandera == 0) {

            Opcion = Menu();

            // comprobamos que tipo calculo a realizar
            switch (Opcion) {
                case 1:
                    Opcion = Numero1 + Numero2;
                    System.out.println("La Suma es:" + Opcion);
                    break;
                case 2:
                    Opcion = Numero1 - Numero2;
                    System.out.println("La Resta es:" + Opcion);
                    break;
                case 3:
                    Opcion = Numero1 * Numero2;
                    System.out.println("La Multiplicacion es: " + Opcion);
                    break;
                case 4:
                    if (Numero2 == 0) {
                        System.out.println("La Divicion por 0 es infinito.");
                    } else {
                        calculo = Numero1 / Numero2;
                        System.out.println("La Divicion es: " + Opcion);
                    }
                    break;
            }

            // si opcion es salir preguntamos si esta seguro
            if (Opcion == 5) {

                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String Confirmacion = leer.next();

                if (Confirmacion.equals("S")) {
                    Bandera = 1;
                }

            }

        }

    }

    public static int Menu() {

        Scanner entrada = new Scanner(System.in);

        int Opcion = 0;

        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        // Entrada de datos
        System.out.println("Ingrese una opcion:");
        Opcion = entrada.nextInt();

        if (Opcion < 1 || Opcion > 5) {
            System.out.println("Error!!!");
        }

        return Opcion;
    }

}
