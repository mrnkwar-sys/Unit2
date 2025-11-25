package bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number introduced by the user
		int num;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//If the number is not valid, the user will have to introduce a number again
		while (num<0 || num>20) {
			System.out.println("Introduzca un número válido:");
			num = sc.nextInt();
		}
					
		//The loop will show a pyramid with the smallest numbers outside and the biggest in the inside
		for (int contador=1; contador <= num; contador++) {
			for (int cont=1; cont <= contador; cont++) {
				System.out.print(cont);
			}
			for (int conta = contador-1; conta>=1; conta--) {
				System.out.print(conta);
			}
			System.out.println();
		}
		
		//Close Scanner
		sc.close();

	}

}
