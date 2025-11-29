package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number introduced by the user
		int num;
		
		//The figure we want to check
		int restNum;
		
		//The quantity of pair figures that there are in the number introduced
		int pair = 0;
		
		//The quantity of impair figures that there are in the number introduced
		int impair = 0;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número mayor que cero:");
		num = sc.nextInt();
		
		//To check the figures of the number one by one, we will divide them by 10
		do {
			restNum = num%10;
			if (restNum%2 == 0) {
				pair++;
			} else {
				impair++;
			}
			num = num/10;
		} while (num>0);
		
		//The console shows the solution in the console
		System.out.println("El número introducido tiene " + pair + " cifras pares y " + impair + " cifras impares");
		
		//Close Scanner
		sc.close();

	}

}
