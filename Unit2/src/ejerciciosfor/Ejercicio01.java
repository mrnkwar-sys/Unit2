package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int num;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//We introduce the prompt to show the result
		System.out.println("Los números hasta el " + num + " son: ");
				
		//We want to show all the numbers from 0 until the number introduced by the user
		for(int contador=1; contador<=num; contador++) {
			System.out.println(contador);
		}
		
		//Close Scanner
		sc.close();

	}

}
