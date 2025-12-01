package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The side of the triangle introduced by the user
		int side;
		
		//The console waits for the user to introduce the side's size
		System.out.println("Introduzca el tamaño del lado del triángulo:");
		side = sc.nextInt();
		
		//The size of the triangle
		for (int size = 1; size <= side; size++) {
			//The spaces that surround the shape of the triangle
			for (int space = 1; space <= size-1; space++) {
					System.out.print(" ");
			}
			
			for (int row = size; row <= side; row++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//Close Scanner
		sc.close();

	}

}
