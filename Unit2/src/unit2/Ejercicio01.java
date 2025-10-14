package unit2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The user's age
		int age;
		
		//To see if the user is an adult or not
		int adult;
		
		//The console waits for us to introduce the age
		System.out.println("Introduzca su edad:");
		age = sc.nextInt();
		
		//We see if the user is an adult
		if (age>=18) {
			age=0;
					System.out.println("Eres mayor de edad");
		}
		
		//Close Scanner
		sc.close();

	}

}
