package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner 
		Scanner sc = new Scanner (System.in);
		
		//The numbers the user has written 
		int firstNum;
		int secondNum;
		
		//The option the user has chosen
		String option;
		
		//The sum of the numbers
		int sum;
		
		//The rest of the numbers
		int rest;
		
		//The multiplication of the numbers
		int mult;
		
		//The division of the numbers
		double div;
		
		//The console waits for the user to introduce the numbers
		System.out.println("Introduzca un número:");
		firstNum = sc.nextInt();
		
		System.out.println("Introduzca otro número:");
		secondNum = sc.nextInt();
		
		//The user has to choose one of the next options
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.println("Elija la letra de una de las anteriores opciones:");
		option = sc.next().toUpperCase();
		
		//The operations
		sum = firstNum + secondNum;
		rest = firstNum - secondNum;
		mult = firstNum*secondNum;
		div = firstNum/secondNum;
				
		//We only do the operation that the user has chosen
		switch (option) {
		case "A" -> System.out.println("El resultado es: " + sum);
		case "B" -> System.out.println ("El resultado es: " + rest);
		case "C" -> System.out.println("El resultado es: " + mult);
		case "D" -> System.out.println("El resultado es: " + (double)div);
		default -> System.out.println("Debe escribir una de las opciones: A, B, C o D");
		}
		
		//Close Scanner
		sc.close();
		
	}

}
