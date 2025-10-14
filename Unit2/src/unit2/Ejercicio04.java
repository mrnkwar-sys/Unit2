package unit2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number the user has introduced
		int firstNum;
		
		//The second number the user has introduced
		int secondNum;
		
		//The console waits for the user to introduce two random numbers
		System.out.println("Introduzca un número: ");
		firstNum = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		secondNum = sc.nextInt();
		
		//We stablish the condition where we want to know the bigger number
		if (firstNum >secondNum) {
			System.out.println("El número mayor es: " + firstNum);
		} else {
			System.out.println("El número mayor es: " + secondNum);
		}
		
		//Close Scanner
		sc.close();

	}

}
