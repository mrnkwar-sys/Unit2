package bucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The first number introduced by the user
		int num;
		
		//The number introduced before another
		int befNum;
		
		//The quantity of mistakes done (if the number is smaller than the one introduced before)
		int quantMista = 0;
		
		//The quantity of numbers introduced, except the 0
		int quantity = 0;
		
		//The console waits for the user to introduce a first number
		System.out.println("Introduzca un primer número:");
		befNum = sc.nextInt();
		
		//The console waits for the user to introduce a number
		do {
			System.out.println("Introduzca otro número:");
			num = sc.nextInt();
			
			quantity++;
			
			if ((befNum > num) && num != 0) {
				quantMista++;
				System.out.println("Error, ha introducido un número menor");
			} 
			
			befNum = num;
				
		} while ((befNum != 0) || (num != 0));
		
		//The results are shown in the console
		System.out.println("Ha introducido " + quantity + " números");
		System.out.println("De los cuales " + quantMista + " han sido errores");
		
		//Close Scanner
		sc.close();
		

	}

}
