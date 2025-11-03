package bolentindowhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int num;
		
		//The number that we will be summing to the number that the user has introduced
		int numSum = 0;
		
		//The total of the sum
		int sum = 0;
		
		//The console waits fr the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//The point is to sum all the number between 1 and the one that the user has introduced
		do {
			sum += numSum;
			numSum++;
		}while (numSum <= num);
		
		//The console shows the result
		System.out.println("La suma total es " + sum);
		
		//Close Scanner
		sc.close();

	}

}
