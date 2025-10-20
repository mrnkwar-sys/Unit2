package ejerciciosswitch;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The first number introduced by the user, written with letters
		String firstNum;
		
		//The second number introduced by the user, written with letters
		String secondNum;
		
		//The first number introduced by the user, written with numbers
		int firstNumle = 0;
		
		//The second number introduced by the user, written with numbers
		int secondNumle = 0;
		
		//The sum of the numbers
		int sum;
		
		//The console waits for the user to introduce a number from a dice
		System.out.println("Escriba (con letras) el primer número que ha obtenido al tirar el dado:");
		firstNum = sc.next();
		
		System.out.println("Escriba (con letras) el segundo número que ha obtenido al tirar el dado:");
		secondNum = sc.next();
		
		//We want to identify the 'String's as numbers
		switch (firstNum) {
		case "uno" -> firstNumle=1;
		case "dos" -> firstNumle=2;
		case "tres" -> firstNumle=3;
		case "cuatro" -> firstNumle=4;
		case "cinco" -> firstNumle=5;
		case "seis" -> firstNumle=6;
		default -> System.out.println("Debe escibir un número del 1 al 6, incluyendo estos");
		}
		
		switch (secondNum) {
		case "uno" -> secondNumle=1;
		case "dos" -> secondNumle=2;
		case "tres" -> secondNumle=3;
		case "cuatro" -> secondNumle=4;
		case "cinco" -> secondNumle=5;
		case "seis" -> secondNumle=6;
		default -> System.out.println("Debe escibir un número del 1 al 6, incluyendo estos");
		}
		
		//We want to sum the numbers
		sum = firstNumle + secondNumle;
		
		//The console shows the result of the sum
		System.out.println("La suma de sus números es: " + sum);
		
		//Close Scanner
		sc.close();

	}

}
