package unit2;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The mark the user has introduced
		double mark;
		
		//The console waits for the user to introduce their mark
		System.out.println("Introduzca su nota:");
		mark = sc.nextDouble();
		
		//We want to tell the user how good is their mark. We apply the condition
		if (mark<3 && mark>=0) {
			System.out.println("Su nota es 'Muy deficiente'");
		} else if (mark>=3 && mark<5) {
			System.out.println("Su nota es 'Insuficiente'");
		} else if (mark>=5 && mark<7) {
			System.out.println("Tiene un 'Bien'");
		} else if (mark>=7 && mark<9) {
			System.out.println("Tiene un 'Notable'");
		} else if (mark>=9 && mark<=10) {
			System.out.println("Tiene un 'Sobresaliente'");
		} else {
			System.out.println("La nota debe ser un valor entre 0 y 10");
		}
		
		//Close Scanner
		sc.close();

	}

}
