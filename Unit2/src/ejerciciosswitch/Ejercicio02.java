package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int day;
		
		//The console waits for the user to introduce a number from 1 to 7
		System.out.println("Introduzca un número del 1 al 7:");
		day = sc.nextInt();
		
		//Each number is a day of the week, being the 1 Monday
		switch (day) {
		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miércoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sábado");
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("Su número no corresponde a ningún día de la semana");
		}
		
		//Close Scanner
		sc.close();

	}

}
