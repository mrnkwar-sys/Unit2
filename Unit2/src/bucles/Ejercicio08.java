package bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The first number introduced by the user
		int num;
		
		//The number with which we are going to do the comparison
		int compNum;
		
		//The quantity of mistakes done (if the number is smaller than the one introduced before)
		int quantMista = 0;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un primer número:");
		num = sc.nextInt();
		
		//The console waits for the user to introduce a number
		do {
			System.out.println("Introduzca otro número:");
			num = sc.nextInt();
			
			compNum = num;
			
			if (compNum < num) {
				quantMista++;
			}
			
		} while (num != 0);
		

	}

}
