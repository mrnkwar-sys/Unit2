package boletinwhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The quantity of positive numbers introduced by the user
		int quantity = 0;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		/*We want to know the quantity of positive numbers introduced by the user,
		 * stopping when they introduce a negative one
		 * */
		while (num>=0) {
			++quantity;
			System.out.println("Introduzca otro número:");
			num = sc.nextInt();
		}
		
		//The console shows the numbers introduced
		System.out.println("Ha introducido " + quantity + " números positivos");
		
		//Close Scanner
		sc.close();

	}

}
