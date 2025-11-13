package boletinwhile;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The age introduced of one of the students
		int age;
		
		//The quantity of students introduced
		int quantityStu = 0;
		
		//The quantity of adults in the class
		int adults = 0;
		
		//The sum of all the ages introduced
		int sumAge = 0;
		
		//The average of the sum of all the ages
		double average;
		
		//The console ask the user to introduce an age
		System.out.println("Introduzca un número:");
		age = sc.nextInt();
		
		//The console will continue asking  the user to introduce an age until they introduce a negative one
		while (age>0) {
			sumAge += age;
			quantityStu++;
			if (age>18) {
				adults++;
			}
			System.out.println("Introduzca otro número:");
			age = sc.nextInt();
		}
		
		//The average of the sum of the ages
		average = sumAge/quantityStu;
		
		//The console will show the results
		System.out.println("Todas las edades suman " + sumAge);
		System.out.println("La media de la clase es de " + (double)average);
		System.out.println("Hay " + quantityStu + " alumnos en la clase");
		System.out.println("Hay " + adults + " mayores de edad en total");
		
		//Close Scanner
		sc.close();

	}

}
