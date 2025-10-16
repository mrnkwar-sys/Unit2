package unit2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The hours the user has introduced
		int hours;
		
		//The minutes introduced
		int minutes;
		
		//The seconds introduced
		int seconds;
		
		//The console waits for the use to introduce the seconds
		System.out.println("Introduzca una cantidad de horas:");
		hours = sc.nextInt();
		
		System.out.println("Introduzca una cantidad de minutos:");
		minutes = sc.nextInt();
		
		System.out.println("Introduzca una cantidad de segundos:");
		seconds = sc.nextInt();
		
		//We have to take into account that the quantities could be incremented
		if (seconds<59) {
			seconds++;
		} else {
			seconds=0;
			if (minutes<59) {
				minutes++;
			} else {
				minutes=0;
				if (hours<23) {
					hours++;
				} else {
					hours=0;
				}
			}
		}
		
		//The console shows the result
		System.out.println("Su tiempo transcurrido un segundo será " + hours + ":" + minutes + ":" + seconds);
		
		//Close Scanner
		sc.close();

	}

}
