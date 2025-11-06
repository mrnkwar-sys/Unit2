package bolentindowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number introduced by the user
		double firstNum;
		
		//The second number introduced by the user
		double secondNum;
		
		//The result of the sum
		double sum;
		
		//The result of the division
		double div;
		
		//The result of the rest
		double rest;
		
		//The result of the multiplication
		double mult;
		
		//The option chose by the user
		String option;
		
		//Until the user tells the console to get out of the program, the operations will be done
		do {
			//The console waits for the user to introduce both numbers
			System.out.println("Introduzca un número:");
			firstNum = sc.nextDouble();
			
			System.out.println("Introduzca otro número:");
			secondNum = sc.nextDouble();
			
			//The options are shown to the user
			System.out.println("¿Qué quiere hacer? Elija una de las siguientes opciones");
			System.out.println("A. Sumar los números");
			System.out.println("B. Restar los números");
			System.out.println("C. Multiplicar los números");
			System.out.println("D. Dividir los números");
			System.out.println("E. Salir del programa");
			option = sc.next().toUpperCase();
			
			//The different operations
			sum = firstNum + secondNum;
			rest = firstNum - secondNum;
			mult = firstNum*secondNum;
			div = firstNum/secondNum;
			
			switch (option) {
			case "A" -> System.out.println("El resultado es " + sum);
			case "B" -> System.out.println("El resultado es " + rest);
			case "C" -> System.out.println("El resultado es " + mult);
			case "D" -> {
				if (secondNum != 0) {
					System.out.println("El resultado es " + (double)div);
				} else {
					System.out.println("No se puede dividir un número entre 0");
				}
			}
			case "E" -> System.out.println("Saliendo del programa...");
			default -> System.out.println("Elija la opción correcta");
			} 
		} while (!option.equals("E"));
		
		//Close Scanner
		sc.close();

	}

}
