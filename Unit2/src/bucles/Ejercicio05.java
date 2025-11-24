package bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number introduced by the user
		int num;
		
		//The console waits for the user to introduce a number from 0 until 20
		System.out.println("Introduzca un número del 0 al 20:");
		num = sc.nextInt();
		
		//If the number is not valid, the user will have to introduce a number again
		while (num<0 || num>20) {
			System.out.println("Introduzca un número válido:");
			num = sc.nextInt();
		}
		
		//The console will show all the numbers repeatedly from 1 until the number introduced
		for (int contador=0; contador<=num; contador++) {
			
		}
		
		//Close Scanner
		sc.close();

	}

}
