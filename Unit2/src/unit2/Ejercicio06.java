package unit2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number the user has introduced
		int firstNum;
		
		//The second number the user has introduced
		int secondNum;
		
		//The console waits for the user to introduce their numbers
		System.out.println("Introduzca un número:");
		firstNum = sc.nextInt();
		
		System.out.println("Introduzca otro número:");
		secondNum = sc.nextInt();
		
		//We want to order the number from the biggest to the smallest
		if (firstNum>secondNum) {
			System.out.println(firstNum + ", " + secondNum);
		} else {
			System.out.println(secondNum + ", " + firstNum);
		}
		
		//Close Scanner
		sc.close();

	}

}
