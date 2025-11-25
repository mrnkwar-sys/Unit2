package bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
				
		//The size of the triangle
		int size;
				
		//The console wais for the user to introduce the size
		System.out.println("Introduzca el tamaño del triángulo:");
		size = sc.nextInt();
				
		//The loop fo the rows
		for (int row=1; row<=size; row++) {
			for(int space=1; space<=size-row; space++) {
				System.out.print(" ");
			}
					
			for(int aster=1; aster<=row; aster++) {
				System.out.print("* ");
			}
					
				System.out.println();
			}
		
		//Close Scanner
		sc.close();

	}

}
