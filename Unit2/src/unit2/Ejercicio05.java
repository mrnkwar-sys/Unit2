package unit2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number the user has introduced
		int number;
		
		//The console waits for the user to introduce a random number
		System.out.println("Introduzca un número: ");
		number = sc.nextInt();
		
		//We want to know if the number is positive or not
		if (number>=0) {
			System.out.println("Tu número es positivo");
		} else {
			System.out.println("Tu número es negativo");
		}
		
		//Close Scanner
		sc.close();

	}

}
