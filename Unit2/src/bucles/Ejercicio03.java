package bucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number introduced by the user
		int firstNum;
		
		//The second number introduced by the user
		int secondNum;
		
		//The smallest number
		int small;
		
		//The maximum
		int max = 1;
		
		//The divisors
		int div;
		
		/* The console waits for the user to introduce the numbers
		 * If any of them is wrong, the console will ask again
		 */
		do {
		System.out.println("Introduzca un primer número:");
		firstNum = sc.nextInt();
		} while (firstNum < 0);
		
		do {
		System.out.println("Introduzca un segundo número:");
		secondNum = sc.nextInt();
		} while (secondNum < 0);
		
		//First, we will which number is larger
		small = Math.min(firstNum, secondNum);
		
		//If the second number is larger
//		for (int contador = small; contador>=1; contador--) {
//			//Check if both numbers can be divided by the same number
//			if (firstNum % contador == 0 && secondNum % contador == 0) {
//				max = contador;
//			}
//		}
		
		//We establish the maximum divisor
		div = small;
		
		while (div >= 1 && max == 1) {
			//Check if it can be divided by the same number
			if (firstNum % div == 0 && secondNum % div == 0) {
				max = div;
			}
			div--;
		}
		
		//The console shows the result
		System.out.println("El m.c.d de " + firstNum + " y " + secondNum + " es " + max);
		
		//Close Scanner
		sc.close();

	}

}
