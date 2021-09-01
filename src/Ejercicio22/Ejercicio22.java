package Ejercicio22;

public class Ejercicio22 {

    public static void main(String[] args) {
        int vector[] = new int[100];
        int num = 1;

        // el bucle se va a iterar 100 veces y asignara el valor de i al vector
        for (int i = 0; i <= 99; i++) {
            vector[i] = num;
            num++;
        }

        // mostramos los numeros en orden descendente
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }

}
