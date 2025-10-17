package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int number;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		number = sc.nextInt();
		
		//We want to show how many figures has the number
		if (number>=0 && number<10) {
			System.out.println("Su número tiene 1 cifra");
		} else if (number>=10 && number<100) {
			System.out.println("Su número tiene 2 cifras");
		} else if (number>=100 && number<1000) {
			System.out.println("Su número tiene 3 cifras");
		} else if (number>=1000 && number<10000) {
			System.out.println("Su número tiene 4 cifras");
		} else if (number>=10000 && number<100000) {
			System.out.println("Su número tiene 5 cifras");
		} else {
			System.out.println("Su número tiene más de cinco cifras");
		}
		
		//Close Scanner
		sc.close();

	}

}
