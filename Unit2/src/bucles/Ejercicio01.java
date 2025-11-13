package bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The hours introduced by the user
		int hour;
		
		//The minutes introduced by the user
		int minute;
		
		//The seconds introduced by the user
		int second;
		
		//The console waits for the user to introduce the time
		System.out.println("Introduzca un número de horas:");
		hour = sc.nextInt();
		
		//If the user introduces a number that can't be understand as an hour, we will tell them
		if (hour>23 || hour<0) {
			System.out.println("Introduzca un número de horas adecuado:");
		}
		
		System.out.println("Introduzca un número de minutos:");
		minute = sc.nextInt();
		
		//If the user introduces a number that can't be understand as a quantity of minutes, we will tell them
		if (minute>60 || minute<0) {
		System.out.println("Introduzca un número de minutos adecuado:");
		}
		
		System.out.println("Introduzca un número de segundos:");
		second = sc.nextInt();
		
		//If the user introduces a number that can't be understand as a quantity of seconds, we will tell them
		if (second>60 || second<0) {
			System.out.println("Introduzca un número de segundos adecuado:");
		}
		
		
		//Close Scanner
		sc.close();

	}

}
