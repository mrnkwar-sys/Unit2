package unit2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first random number
		int x;
		
		//The second random number
		int y;
		
		//The sum of the numbers
		int sum;
		
		//The rest of the number
		int rest;
		
		//The division of the numbers
		double division;
		
		//The multiplication of the numbers
		int multiply;
		
		//The console waits for the user to introduce random numbers
		System.out.println("Introduzca un número:");
		x = sc.nextInt();
		
		System.out.println("Introduzca otro número:");
		y = sc.nextInt();
		
		//The needed operations
		sum = x + y;
		rest = x-y;
		division = (double) x/y;
		multiply = x*y;
		
		//The results of the multiplication, division and sum are showed
		System.out.println("La suma es igual a " + sum);
		System.out.println("La resta es igual a " + rest);
		System.out.println("La multiplicación es igual a " + multiply);
		
		//If we take into account that the second number could be a 0
		if (y == 0 || x == 0) {
			System.out.println("La división es igual a Error");
		} else {
			System.out.println("La división es igual a " + division);
		}
		
		//Close Scanner
		sc.close();
		
	}

}
