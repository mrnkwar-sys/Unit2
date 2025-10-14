package unit2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number the user has introduced
		int firstNum;
		
		//The second number the user has introduced
		int secondNum;
		
		//The console waits for the user to introduce their number
		System.out.println("Inroduzca un número: ");
		firstNum = sc.nextInt();
		
		System.out.println("Introduzca otro número: ");
		secondNum = sc.nextInt();
		
		//First, we want to know which of the numbers is bigger, or if the numbers are equals 
		if (firstNum>secondNum) {
			System.out.println("El número mayor es " + firstNum);
		} else if (secondNum>firstNum){
			System.out.println("El número mayor es " + secondNum);
		} else if (firstNum == secondNum) {
			System.out.println("Los números son iguales");
		}
		
		//Close Scanner
		sc.close();

	}

}
