package bolentindowhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The number introduced by the user
		int num;
		
		//The number multiplying the one introduced by the user
		int numMult=1;
		
		//The result of the multiplication
		int result;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número: ");
		num = sc.nextInt();
		
		//We want to show the multiplication table of the number introduced by the user
		do {
			result = num*numMult;
			System.out.println(num + "x" + numMult + "=" + result);
			numMult++;
		} while (numMult <= 10);
		
		//Close Scanner
		sc.close();

	}

}
