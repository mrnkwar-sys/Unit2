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
		final String PIEDRA = null;
		
		//The movement 'Papel'
		final String PAPEL = null;
		
		//The movement 'Tijeras'
		final String TIJERAS = null;
		
		//The console waits for the player to tell what they're going to do
		System.out.println("Elija piedra, papel o tijeras:");
		firstPlayer = sc.nextLine();
		
		System.out.println("El otro jugador contraataca con:");
		secondPlayer = sc.nextLine();
		
		//We establish how one the users would win
		if (firstPlayer.equals(TIJERAS) || firstPlayer.equals(PAPEL) || firstPlayer.equals(PIEDRA)) {
			System.out.println("Primera jugada incorrecta");
		} else if (!firstPlayer.equals(TIJERAS) && !firstPlayer.equals(PAPEL) && !firstPlayer.equals(PIEDRA)) {
			System.out.println("Segunda jugada incorrecta");
		} else if (firstPlayer.equals(secondPlayer)) {
			System.out.println("EMPATE");
		} else if (firstPlayer.equals(PIEDRA) && secondPlayer.equals(TIJERAS)
				|| firstPlayer.equals(PAPEL) && secondPlayer.equals(PIEDRA)
				|| firstPlayer.equals(TIJERAS) && secondPlayer.equals(PAPEL)) {
			System.out.println("Gana el primer jugador");
		} else {
			System.out.println("Gana el segundo jugador");
		}
		
		//Close Scanner
		sc.close();
		
	}

}
