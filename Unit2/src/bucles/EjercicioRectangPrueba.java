package bucles;

import java.util.Scanner;

public class EjercicioRectangPrueba {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The size of the side of the rectangle
		int side;
		
		//The console waits for the user to introduce the size
		System.out.println("Introduzca el tamaño del lado del cuadrado:");
		side = sc.nextInt();
		
		//The loop for the rows
		for (int row = 1; row <= side; row++) {
			//The loop for the columns
			if(row == 1 || row == side) {
				for (int col = 1; col <= side; col++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
			}
			//Pinta asteriscos y espacios en medio
			System.out.print("*");
			
			//To paint the spaces
			for(int space = 1; space <= side-2; space++) {
				System.out.print(" ");
			}
			
			//Pintamos asterisco al final
			System.out.print("*");
		}
		
		System.out.println();
		
		//Close Scanner
		sc.close();

	}

}
