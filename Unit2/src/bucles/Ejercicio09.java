package bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number introduced by the user
		int num;
		
		//The quantity of figures that the number has (the program is asking for a number with at least 1 figure)
		int figure = 1;
		
		//The rest of the division
		int rest;
		
		//The console waits for the user to introduce a number
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//If the numbers is not correct, the console will ask again for a valid answer
		while (num <= 0) {
			System.out.println("Introduzca un número mayor que cero:");
			num = sc.nextInt();
		}
		
		//To get the quantity of figures, first we will check if the number is larger than 10
		while (num >= 10) {
			//If it is, we will divide it by 10
			rest = num/10;
			//We sum one more figure
			figure++;
			//Now the initial number is the one we got from dividing the number introduced by ten, a smaller one
			num = rest;
		}
		
		//The console shows the answer
		System.out.println("El número tiene " + figure + " cifras");
		
		//Close Scanner
		sc.close();

	}

}
