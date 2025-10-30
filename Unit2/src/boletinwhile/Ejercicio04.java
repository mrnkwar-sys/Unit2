package boletinwhile;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The numbers introduced by the user
		int num;
		
		//The quantity of numbers introduced (no more than ten)
		int quantity = 0;
		
		//The quantity of negative numbers introduced
		int quantityNeg = 0;
		
		//The quantity of 0 introduced
		int quantityCer = 0;
		
		//The sum of the negative numbers
		int sumNeg = 0;
		
		//The sum of the psotive numbers
		int sumPos = 0;
		
		//The average of the negative numbers
		double averageNeg;
		
		//The user can only introduce 10 number, no more, so that's the first condition we establish
		while (quantity<10) {
			
			//The console waits for the user to introduce a number
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			
			//We want to sum the positive numbers
			if (num > 0) {
				sumPos += num;
				
			//As we need the average of the negative numbers, we need both the sum and the quantity
			} else if (num < 0){
				sumNeg +=num;
				++quantityNeg;
			
			//We also need the quantity of 0 introduced
			} else {
				++quantityCer;
			}
			
			++quantity;
		}
		
		//Now, we calculate the average of the negative numbers
		averageNeg = (double) sumNeg/quantityNeg;
		
		//The console shows the sum of the positive numbers, the average of the negative numbers, and the quantity of 0
		System.out.println("La suma de los números positivos es: " + sumPos);
		System.out.println("La media de los números negativos es: " + averageNeg);
		System.out.println("Se han introducido " + quantityCer + " ceros");
		
		//Close Scanner
		sc.close();

	}

}
