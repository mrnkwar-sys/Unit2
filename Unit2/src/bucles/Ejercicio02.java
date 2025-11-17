package bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int num;
		
		//If it is a prime number or not
		boolean prime = true;
		
		//The quantity of prime numbers that there are between 1 and the number introduced
		int quantPrime = 0;
		
		//If the number can be divided by other number`
		int divisor;
		
		//The console waits for the user to introduce a number
		do {
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		} while (num < 0 || num == 1);
		
		/* We will show all the prime numbers from 1 until the number introduced
		 * If the number is prime, it will be shown in the console
		 */
		for(int contador=2; contador<=num; contador++) {
			divisor = 2;
			prime = true;
			//Check if it is a prime number
			while(divisor<contador && prime) {
				if(contador%divisor == 0) {
					prime = false;
				}
				divisor++;
			}
			if (prime) {
				quantPrime++;
			}
		}
		
		//The console shows the results
		System.out.println("Hay " + quantPrime + " números primos entre el 1 y el " + num);
		
		//Close Scanner
		sc.close();
		

	}

}
