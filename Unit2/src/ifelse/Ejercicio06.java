package ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number introduced by the user
		int firstNum;
		
		//The second number introduced by the user
		int secondNum;
		
		//The third number introduced by the user
		int thirdNum;
		
		//The sum of two numbers
		int sum;
		
		//The console waits for the user to introduce the numbers
		System.out.println("Introduzca un primer número:");
		firstNum = sc.nextInt();
		
		System.out.println("Introduzca un segundo número:");
		secondNum = sc.nextInt();
		
		System.out.println("Introduzca un tercer número:");
		thirdNum = sc.nextInt();
		
		//First, we need the sum of the first two numbers
		sum = firstNum+secondNum;
		
		//We want to know if the result of that sum equals the third number introduced
		if (sum == thirdNum) {
			System.out.println("La suma de los dos primeros números es igual al tercero");
		} else {
			System.out.println("La suma de los dos primeros números es distinta al valor del tercero");
			System.out.println("El resultado sería: " + sum);
		}
		
		//Close Scanner
		sc.close();
	}

}
