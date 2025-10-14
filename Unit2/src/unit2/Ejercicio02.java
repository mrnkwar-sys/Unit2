package unit2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The user's age
		int age;
		
		//The console waits for the user to introduce their age
		System.out.println("Introduzca su edad:");
		age = sc.nextInt();
		
		//We see if the user is really an adult or not
		if (age>=18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		//Close Scanner
		sc.close();

	}

}
