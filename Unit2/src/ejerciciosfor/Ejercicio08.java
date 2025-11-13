package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The A number introduced by the user
		int numberA;
		
		//The B number introduced by the user
		int numberB;
		
		//The larger number
		int large;
		
		//The smaller number
		int small;
		
		//The console waits for the user to introduce their numbers
		System.out.println("Introduzca un número:");
		numberA = sc.nextInt();
		
		System.out.println("Introduzca otro número:");
		numberB = sc.nextInt();
		
		//If A is larger than B, the console will show all the numbers from A until B
		if (numberA<numberB) {
			large = numberB;
			small= numberA;
		} else {
			large = numberA;
			small = numberB;
		}
		
		//The console shows the answer
		for (int contador=small; contador<=large; contador++) {
			System.out.println(contador);
		}
		
		//Close Scanner
		sc.close();

	}

}
