package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number the user has introduced
		double number;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número con decimales:");
		number = sc.nextDouble();
		
		//The numbers 'almost cero' don't include the 0, the 1 and -1
		if (number>-1 && number<1 && number != 0) {
			System.out.println("Su número es un número casi-cero");
		} else {
			System.out.println("Su número no es un casi cero");
		}
		
		//Close Scanner
		sc.close();

	}

}
