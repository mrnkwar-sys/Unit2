package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The mark introduced by the user
		int mark;
		
		//The console waits for the user to introduce their mark
		System.out.println("Introduzca su nota:");
		mark = sc.nextInt();
		
		//We want to know how good id the user's mark
		switch (mark) {
		case 0,1,2,3,4 -> System.out.println("Insuficiente");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7,8 -> System.out.println("Notable");
		case 9,10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Su nota debe ser un valor entre 0 y 10");
		}
		
		//Close Scanner
		sc.close();

	}

}
