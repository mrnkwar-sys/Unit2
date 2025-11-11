package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The mark introduced by the user
		double mark;
		
		//The quantity of fails introduced
		int fail = 0;
		
		//The console waits for the user to introduce a grade
		System.out.println("Introduzca una nota:");
		
		//The user has to introduce five marks
		for (int contador=1; contador<=5; contador++) {
			mark = sc.nextDouble();
			if (mark<5) {
				fail++;
			}
		}
		
		//The console shows how many fails have been introduced
		System.out.println("Hay " + fail + " suspensos");
		
		//Close Scanner
		sc.close();

	}

}
