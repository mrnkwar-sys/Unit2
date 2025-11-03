package bolentindowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//Create a Random
		Random rand = new Random();
		
		//The message where the user tells the program if the number is correct, larger or smaller
		String message;
		
		//The minimum 
		int min = 1;
		
		//The maximum
		int max = 101;
		
		//The random number
		int randomNum;
		
		//First the console will show a random number between 0 and 100
		do {
			randomNum = rand.nextInt(min,max);
			System.out.println("¿Es este tu número? " + randomNum);
			message = sc.next();
			
		//As the number can be smaller, larger or the same the user has thought about, the console will ask the user
			if (message.equals("Menor")) {
				max = randomNum;
			} else if (message.equals("Mayor")){
				min = randomNum++;
			}
		} while (!message.equals("Igual"));
		
		//The console have guessed the number
		System.out.println("¡He acertado!");
		
		//Close Scanner
		sc.close();

	}

}
