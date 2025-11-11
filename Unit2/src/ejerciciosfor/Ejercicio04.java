package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The sum of the impair numbers
		int sum = 0;
		
		//The console will introduce the prompt to introduce the answer
		System.out.print("La suma de los 10 primeros números impares es ");
		
		//We want to show the sum of the first 10 impair numbers
		for(int contador=0; contador<20; contador++) {
			
			//The numbers that can be divided by 2 are impairs
			if (contador%2 != 0) {
				sum += contador;
			}
		}
		
		//The console finally shows the answer
		System.out.print(sum);
		
		//Close Scanner
		sc.close();

	}

}
