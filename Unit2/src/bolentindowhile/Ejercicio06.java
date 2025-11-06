package bolentindowhile;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The choice of the first player
		String firstMove;
		
		//The choice of the second player
		String secondMove;
		
		/* The console waits for the user to introduce his choice: rock, paper or scissors
		 * If the answer is incorrect, the console will ask the user again to introduce the answer
		 */
		do {
			System.out.println("Introduzca su primer movimiento:");
			firstMove = sc.next();
		} while (!(firstMove.equalsIgnoreCase("PIEDRA")||firstMove.equalsIgnoreCase("PAPEL")||firstMove.equalsIgnoreCase("TIJERAS")));
		
		do {
			System.out.println("Introduzca su segundo movimiento:");
			secondMove = sc.next();
		} while (!(secondMove.equalsIgnoreCase("PIEDRA")||secondMove.equalsIgnoreCase("PAPEL")||secondMove.equalsIgnoreCase("TIJERAS")));
		
		//If both users choose the same option, there is a draw. If not, one of them will win
		if (firstMove.equals(secondMove)) {
				System.out.println("EMPATE");
			} else if (firstMove.equals("PIEDRA") && secondMove.equals("TIJERAS") ||
					firstMove.equals("TIJERAS") && secondMove.equals("PAPEL") ||
					firstMove.equals("PAPEL") && secondMove.equals("PIEDRA")){
				System.out.println("Gana el primer jugador");
			} else {
				System.out.println("Gana el segundo jugador");
			}
		
		//Close Scanner
		sc.close();

	}

}
