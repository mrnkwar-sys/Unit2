package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number introduced by the user
		int num;
		
		//Number with reversed figures
		int revers = 0;
		
		//Where we keep the number introduced by the user
		int auxNum;
		
		//The last figure of the number
		int lastFig;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//We keep the value of the number introduced
		auxNum = num;
		
		while (auxNum > 0) {
			lastFig = auxNum%10;
			revers = revers*10 + lastFig;
			auxNum /= 10;
		}
		
		//The console shows the result
		System.out.println(revers==num? "El número es capicúa" : "El número no es capicúa");
		
		//Close Scanner
		sc.close();

	}

}
