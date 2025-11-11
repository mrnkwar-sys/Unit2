package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int num;
		
		//The factorial of that number
		long factorial = 1;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//The console introduces the prompt to show the answer
		System.out.print(num + "! es igual a: ");
		
		//We want to calculate the factorial of the number introduced by the user
		for (int contador=num; contador>=1; contador--) {
			
			//We will always want to show the numbers of the factorial
			System.out.print(contador);
			
			//But we will only show the multiplying symbol while the number is larger than 1
			if (contador!=1) {
				System.out.print("x");
			}
			factorial *= contador;
		}
		
		//The console finally shows the result of the factorial
		System.out.print("=" + factorial);
		
		//Close Scanner
		sc.close();

	}

}
