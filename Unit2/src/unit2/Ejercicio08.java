package unit2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number introduced
		int firstNum;
		
		//The second number introduced
		int secondNum;
		
		//The third number introduced
		int thirdNum;
		
		//The console waits for the user to introduce the numbers
		System.out.println("Introduzca un número:");
		firstNum = sc.nextInt();
		
		System.out.println("Introduzca otro número:");
		secondNum = sc.nextInt();
		
		System.out.println("Introduzca un último número");
		thirdNum = sc.nextInt();
		
		//We want to show the biggest number, so we apply the condition
		if (firstNum>secondNum && firstNum>thirdNum) {
			System.out.println("El mayor número es:" + firstNum);
		} else if (secondNum>firstNum && secondNum>thirdNum) {
			System.out.println("El mayor número es:" + secondNum);
		} else {
			System.out.println("El mayor número es:" + thirdNum);
		}
		
		//Close Scanner
		sc.close();

	}

}
