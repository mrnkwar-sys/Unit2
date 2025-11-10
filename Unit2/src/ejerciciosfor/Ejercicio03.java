package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The  number introduced by the user
		int num;
		
		//The sum of the numbers
		int sum = 0;
		
		//The average of the numbers introduced by the user
		double average = 0;
		
		//The console ask the user to introduce a number
		System.out.println("Introduzca un número:");
		
		//The console waits for the user to introduce ten numbers, no more
		for (int contador=0; contador<10; contador++) {
			
		//The console ask for the number
			num = sc.nextInt();
			
		//The sum of the numbers while the user introduces a number
			sum += num;
		}
		
		//Now we calculate the average of the numbers introduced by the user
		average = (double) sum/10;
		
		//We show the result in the console
		System.out.println("La media de los números introducidos es " + average);
		
		//Close Scanner
		sc.close();

	}

}
