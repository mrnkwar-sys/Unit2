package boletinwhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The sum of the numbers introduced
		int sum = 0;
		
		//The quantity of positive number introduced
		int quantity = 0;
		
		//The average of the numbers introduced by the user
		double average;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//As we want the average of the numbers, we will sum until the user introduces a negative number
		while (num>=0) {
			sum += num;
			++quantity;
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
		}
		
		//The operation to get the average
		average = (double) sum/quantity;
		
		//The result is shown in the console
		System.out.println("La media de los números introducidos es " + average);
		
		//Close Scanner
		sc.close();

	}

}
