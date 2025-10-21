package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int num;
		
		//The console waits for the user to introduce the number
		System.out.println("Introduzca un número entre 0 y 9999:");
		num = sc.nextInt();
		
		//We contemplate the case where the user writes an incorrect number
		if (num<0 && num>9999) {
			System.out.println("El número introducido es incorrecto");
			
		//If the number only has one figure
		} else if (num<10) {
			System.out.println("Su número es capicúa");
			
		//If the number only has two figures
		} else if (num<100) {
			if (num%10 == num/10) {
			System.out.println("El número es capicúa");
			} else {
				System.out.println("Su número no es capicúa");
			}
			
		//If the number has three figures
		} else if (num<1000) {
			if (num/100 == num%10) {
				System.out.println("El número es capicúa");
			} else {
				System.out.println("Su número no es capicúa");
			}
			
		//If the number has four figures
		} else if (num<9999) {
			if ((num/1000 == num/1110) && (num/100 == num%100)) {
				System.out.println("Su número es capicúa");
			} else {
				System.out.println("Su número no es capicúa");
			}
		}
		
		//Close Scanner
		sc.close();

	}

}
