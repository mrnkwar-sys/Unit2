package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//Create a Random
		Random rand = new Random();
		
		//The first random number shown in the console
		int firstRand;
		
		//The second random number shown in the console
		int secondRand;
		
		//The sum of the random numbers
		int sum;
		
		//The result given by the user
		int result;
		
		//The console shows a two random numbers
		firstRand = rand.nextInt(1,99);
		System.out.println("El primer número es " + firstRand);
		
		secondRand = rand.nextInt(1,99);
		System.out.println("El segundo número es " + secondRand);
		
		//The console tells the user that they have to sum the numbers
		System.out.println("Ahora suma ambos números y escribe el resultado: ");
		result = sc.nextInt();
		
		//The sum of the random numbers
		sum = firstRand + secondRand;
		
		//Now we have to check if the result is correct or not
		if (sum == result) {
			System.out.println("Su resultado es correcto");
		} else {
			System.out.println("Su resultado es incorrecto");
		}
		
		//Close Scanner
		sc.close();

	}

}
