
package Ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int vectorNum[] = new int[10];
		int num;

		// llamada al metodo para llenar el arreglo con valores aleatorios
		rellenarVector(vectorNum);

		System.out.println("Ingrese el numero que desea buscar en el vector:");
		num = sc.nextInt();
				
		buscarNumero(vectorNum, num);
		// cerramos la entrada de datos
		sc.close();
	}

	private static void buscarNumero(int[] vector, int num) {
		
		int numRepetido = 0;
		
		for (int i = 0; i < vector.length; i++) {
			// Validamos si la vector[i] igual al num
			if (vector[i] == num) {
				System.out.println("El numero: " + num + " se encuentra en la posicion [" + i + "] del vector.");
				numRepetido++; 
			}
		}
		
		if (numRepetido > 1) {
			System.out.println("El numero se ha repitdo: [" + numRepetido + "] veces.");
		}
		
		
	}

	public static void rellenarVector(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 20) + 1; // este código nos genera numeros entre 1 y 20.
		}

		//mostrarVector(vector);
	}

	public static void mostrarVector(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			System.out.print("[" + vector[i] + "]");
		}
		
		System.out.println("");
    }
    
}
