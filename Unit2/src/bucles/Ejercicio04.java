package bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);

		// The first number introduced by the user
		int firstNum;

		// The second number introduced by the user
		int secondNum;

		// The largest number among the ones introduced
		int big;

		boolean esMcm = true;
		// The console waits for the user to introduce the numbers
		do {
			System.out.println("Introduzca un primer número");
			firstNum = sc.nextInt();
		} while (firstNum < 0);

		do {
			System.out.println("Introduzca un segundo número");
			secondNum = sc.nextInt();
		} while (secondNum < 0);

		// We check which number is larger
		big = Math.max(firstNum, secondNum);

		while (esMcm) {
			if (big % firstNum != 0 && big % secondNum != 0) {
				System.out.println("El m.c.m de " + firstNum + " y " + secondNum + " es " + big);
				esMcm = false;
			}
			big++;
		}
		
		//The console shows the results
		
		//Close Scanner
		sc.close();

	}

}
