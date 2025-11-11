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
		
		//The console waits for the user to introduce their numbers
		System.out.println("Introduzca un número:");
		numberA = sc.nextInt();
		
		System.out.println("Introduzca otro número:");
		numberB = sc.nextInt();
		
		//If A is larger than B, the console will show all the numbers from A until B
		if (numberA>numberB) {
			for (int contador=numberA; contador>=numberB; contador--) {
				System.out.print(contador);
			}
		} else {
			for (int contador=numberB; contador>=numberA; contador--) {
				System.out.print(contador);
			}
		}
		
		//Close Scanner
		sc.close();

	}

}
