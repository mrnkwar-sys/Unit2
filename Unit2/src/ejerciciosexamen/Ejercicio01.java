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
		for(int contador = 1; contador <= side; contador++) {
			if(contador == 1 || contador == side) {
				for (int row = 1; row <= side; row++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int space = 1; space <= side-2; space++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
				System.out.println();
		}
		
		//Close Scanner
		sc.close();

	}

}
