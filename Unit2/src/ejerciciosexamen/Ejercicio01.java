package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number introduced by the user that will define how big is the side of the square
		int side;
		
		//The console waits for the user to introduce the number
		System.out.println("Introduzca el tamaño del lado del cuadrado:");
		side = sc.nextInt();
		
		//We will draw asterisks as many times as the number introduced
		for (int column = 0; column <= side; column++) {
			if (column >= 1 && column < side) {
				for (int i=0; i <= side-2; i++) {
					System.out.println("*");
					for (int j=0; j <= side-2; j++) {
						System.out.println(" ");
					}
				}
			}
			if (column < 1 || column >= side) {
				for (int cont = 0; cont < side-2; cont++) {
					System.out.println("*");
				}
			}
			System.out.println("*");
		}
		
		//Close Scanner
		sc.close();

	}

}
