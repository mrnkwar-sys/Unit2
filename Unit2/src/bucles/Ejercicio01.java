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
		
		/* The console waits for the user to introduce the hours
		 * if the quantity of hours can't be understand as a time, it will ask again
		 */
		do {
			System.out.println("Introduzca un número de horas:");
			hour = sc.nextInt();
		} while (hour<0 || hour>23);
		
		/* The console waits for the user to introduce the minutes
		 * if the quantity of minutes can't be understand as a time, it will ask again
		 */
		do {
			System.out.println("Introduzca un número de minutos:");
			minute = sc.nextInt();
		} while (minute<0 || minute>60);
		
		/* The console waits for the user to introduce the time
		 * if the quantity of hours can't be understand as a time, it will ask again
		 */
		do {
			System.out.println("Introduzca un número de segundos:");
			second = sc.nextInt();
		} while (second<0 || second>60);
		
		//The console waits for the user to introduce how many seconds they want to increase the time
		
		
		
		//Close Scanner
		sc.close();

	}

}
