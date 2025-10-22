package ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The movement of the first player
		String firstPlayer;
		
		//The movement of the second player
		String secondPlayer;
		
		//The movement 'Piedra'
		final String PIEDRA = "PIEDRA";
		
		//The movement 'Papel'
		final String PAPEL = "PAPEL";
		
		//The movement 'Tijeras'
		final String TIJERAS = "TIJERAS";
		
		//The console waits for the player to tell what they're going to do
		System.out.println("Elija piedra, papel o tijeras:");
		firstPlayer = sc.nextLine();
		
		//If the first player introduces an incorrect answer, the console will tell them
		if (!firstPlayer.equals(TIJERAS) && !firstPlayer.equals(PAPEL) && !firstPlayer.equals(PIEDRA)) {
			System.out.println("Primera jugada incorrecta");
			
		//If they didn't, the game continues
		} else {
			System.out.println("El otro jugador contraataca con:");
			secondPlayer = sc.nextLine();
		
		//If the second player introduces an incorrect answer, the console will tell them
		if (!secondPlayer.equals(TIJERAS) && !secondPlayer.equals(PAPEL) && !secondPlayer.equals(PIEDRA)) {
				System.out.println("Segunda jugada incorrecta");
				
		//If both players introduce the same answer, the result of the game will be draw
		} else if (firstPlayer.equals(secondPlayer)) {
			System.out.println("EMPATE");
			
		//If neither of the 
		} else if (firstPlayer.equals(PIEDRA) && secondPlayer.equals(TIJERAS)
				|| firstPlayer.equals(PAPEL) && secondPlayer.equals(PIEDRA)
				|| firstPlayer.equals(TIJERAS) && secondPlayer.equals(PAPEL)) {
			System.out.println("Gana el primer jugador");
		} else {
			System.out.println("Gana el segundo jugador");
		}
		}
		
		//Close Scanner
		sc.close();
		
	}

}
