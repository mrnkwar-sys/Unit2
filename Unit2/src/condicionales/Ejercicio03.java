package condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The ID number introduced by the user
		int idNum;
		
		//The number that we get after dividing the idNum/23
		int rest;
		
		//The letter of the id
		char idLetter = 'a';
		
		//The console waits for the user to introduce their number
		System.out.println("Introduzca su número de DNI: ");
		idNum = sc.nextInt();
		
		//We calculate the letter of the ID
		rest = idNum%23;
		
		//Depending of the value of the idLetter, we will give a different letter
		switch (rest) {
		case 0 -> idLetter='T';
		case 1 -> idLetter='R';
		case 2 -> idLetter='W';
		case 3 -> idLetter='A';
		case 4 -> idLetter='G';
		case 5 -> idLetter='M';
		case 6 -> idLetter='Y';
		case 7 -> idLetter='F';
		case 8 -> idLetter='P';
		case 9 -> idLetter='D';
		case 10 -> idLetter='X';
		case 11 -> idLetter='B';
		case 12 -> idLetter='N';
		case 13 -> idLetter='J';
		case 14 -> idLetter='Z';
		case 15 -> idLetter='S';
		case 16 -> idLetter='Q';
		case 17 -> idLetter='V';
		case 18 -> idLetter='H';
		case 19 -> idLetter='L';
		case 20 -> idLetter='C';
		case 21 -> idLetter='K';
		case 22 -> idLetter='E';
		}
		
		//We show the result in the console
		System.out.println("Su número de DNI es: " + idNum + idLetter);
		
		//Close Scanner
		sc.close();

	}

}
