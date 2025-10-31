package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The money that the user has in their bank account
		double moneyBank;
		
		//The rate of interest of the "A" bank account
		double bankA = 0.015;
		
		//The rate of interest of the "B" bank account
		double bankB = 0.02;
		
		//The rate of interest of the "C" bank account
		double bankC = 0.015;
		
		//The rate of interest of the "D" bank account
		double bankD = 0.05;
		
		//The type of account chose by the user
		String account;
		
		//The money that the user will earn
		double moneyEarn = 0;
		
		//The console waits for the user to write how much do they have in their account
		System.out.println("Enter the amount of money you want to keep in the bank:");
		moneyBank = sc.nextDouble();
		
		//Then, the user has to choose what kind of account do they want
		System.out.println("Choose the type of bank account that you want:");
		System.out.println("A. The anual rate of interest is 1.5%");
		System.out.println("B. The anual rate of interest is 2%");
		System.out.println("C. The anual rate of interest is 1.5%");
		System.out.println("D. The anual rate of interest is 5%");
		
		account=sc.next().toUpperCase();
		
		//Depending of the type of bank account, the user will earn a different amount of money
		switch (account) {
		case "A"-> moneyEarn = moneyBank*bankA;
		case "B"-> moneyEarn = moneyBank*bankB;
		case "C"-> moneyEarn = moneyBank*bankC;
		case "D"-> moneyEarn = moneyBank*bankD;
		}
		
		//The console will show the quantity of money that the user will earn 
		System.out.println("You will earn " + moneyEarn + "dollars if you choose that type of bank account");
		
		//Close Scanner
		sc.close();
	}

}
