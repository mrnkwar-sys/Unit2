package ifelse;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number the user has introduced
		int number;
		
		//If the number is pair
		int pairNum;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		number = sc.nextInt();
		
		//To prove if the number is pair or not
		pairNum = number%2;
		
		//We want to tell if the number is pair or not
		if (pairNum == 0) {
			System.out.println("Su número es par");
		} else {
			System.out.println("Su número es impar");
		}
		
		//Close Scanner
		sc.close();

	}

}
