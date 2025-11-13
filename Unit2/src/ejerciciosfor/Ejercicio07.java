package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int num;
		
		//The boolean that will establish if the number is a prime number or not
		boolean prime = true;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número entero positivo:");
		num = sc.nextInt();
		
		//The prime numbers are only divisible by themselves and 1
		for (int contador=2; contador<num; contador++) {
			if (num%contador == 0) {
				prime = false;
			}
		}
		
		if (num == 1) {
			System.out.println("Su número no es primo");
		} else if (prime) {
			System.out.println("Su número es primo");
		} else {
			System.out.println("Su número no es primo");
		}
		
		//Close Scanner
		sc.close();

	}

}
