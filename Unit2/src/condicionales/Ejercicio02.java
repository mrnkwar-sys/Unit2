package condicionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number the user has introduced
		int num;
		
		//The absolute value of the number
		int absoluteNum;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//If the number is negative, we will follow he next process
		absoluteNum = num<0 ? (num-num)-num : num;
		
		//The results are shown in the console
		System.out.println("El valor absoluto del número introducido es: " + absoluteNum);
		
		//Close Scanner
		sc.close();

	}

}
