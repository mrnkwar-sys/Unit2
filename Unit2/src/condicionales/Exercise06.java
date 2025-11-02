package condicionales;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The days of the month
		int days;
		
		//The month
		int month;
		
		//The year
		int year;
		
		//The console waits for the user to introduce a month
		System.out.println("Introduzca el número de un mes del año: ");
		month = sc.nextInt();
		
		//Now, it waits for the user to introduce a year
		System.out.println("Introduzca el año:");
		year = sc.nextInt();
		
		//We want to show if the month has 30 or 31 days. As for February, if it had 28 or 29 days
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 : System.out.println("El mes tiene 31 días");
		break;
		case 4, 6, 9, 11 : System.out.println("El mes tiene 30 días");
		break;
		case 2 : if (year%4 == 0 || year%400 == 0) {
			System.out.println("El mes tiene 29 días");
		} else {
			System.out.println("El mes tiene 28 días");
		}
		
		//Close Scanner
		sc.close();
		
		}

	}

}
