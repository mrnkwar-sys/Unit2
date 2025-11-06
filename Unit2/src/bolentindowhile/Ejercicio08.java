package bolentindowhile;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number with letters that the user has got
		String firstNum;
		
		//The second number with letters that the user has got
		String secondNum;
		
		//The first number that the user has got
		int oneNum;
		
		//The second number that the user has got
		int twoNum;
		
		//The console will ask the user for a number until they write a correct answer
		do {
			System.out.println("Escriba con letras el primer número obtenido del dado:");
			firstNum = sc.next().toUpperCase();
		} while (!(firstNum.equals("UNO") || firstNum.equals("DOS") || firstNum.equals("TRES") || 
				firstNum.equals("CUATRO") || firstNum.equals("CINCO") || firstNum.equals("SEIS")));
		
		//We turn that word
		switch (firstNum) {
		case "UNO" -> oneNum = 1;
		case "DOS" -> oneNum = 2;
		case "TRES" -> oneNum = 3;
		case "CUATRO" -> oneNum = 4;
		case "CINCO" -> oneNum = 5;
		case "SEIS" -> oneNum = 6;
		
		
		}

	}

}
