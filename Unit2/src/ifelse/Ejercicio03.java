package ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number the user has introduced
		int aNum;
		
		//The second number the user has introduced
		int bNum;
		
		//The third number the user has introduced
		int cNum;
		
		//The value of what is inside the square root
		double squareRoot;
		
		//The first result
		double firstResult;
		
		//The second result
		double secondResult;
		
		//The console waits for the user to introduce the numbers
		System.out.println("Introduzca un número:");
		aNum = sc.nextInt();
		
		System.out.println("Introduzca un segundo número:");
		bNum = sc.nextInt();
		
		System.out.println("Introduzca un tercer número:");
		cNum = sc.nextInt();
		
		//We establish the value of the square root
		squareRoot = bNum*bNum - 4*aNum*cNum;
		
		//The aNum can't be 0
		if (aNum==0) {
			firstResult = (double)-cNum/bNum;
			System.out.println("La ecuación tiene una única solución");
		} else if (squareRoot >=0) {
			firstResult = (-bNum + Math.sqrt(squareRoot))/(2*aNum);
			secondResult = (-bNum - Math.sqrt(squareRoot))/(2*aNum);
			
			//We show the results in the console
			System.out.println("El primer resultado será " + firstResult);
			System.out.println("El segundo resultado será " + secondResult);
		} else {
			System.out.println("La ecuación no tiene solución");
		}
		
		//Close Scanner
		sc.close();

	}

}
