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
			if (size == 1) {
				System.out.println("*");
			}
			
			//The spaces that surround the shape of the triangle
			if (size >= 2) {
				for (int space = 1; space <= side-1; space++) {
					
				}
			}
		}
		
		//Close Scanner
		sc.close();

	}

}
