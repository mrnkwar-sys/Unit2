package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//We will count the multiples of three
		int contMult = 0;
		
		//The number introduced by the user
		int num;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		for(int contador=1; contador<=num; contador++) {
			if (contador%3 == 0) {
				contMult++;
			}
		}
		
		//The console shows the result
		System.out.println("Hay " + contMult + " múltiplos de 3 hasta el número " + num);
		
		//Close Scanner
		sc.close();

	}

}
