package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The cost of the basic system
		final double  basicSystem = 375.99;
				
		//The price of a 38 cm screen
		final double smallScreen = 75.99;
				
		//The price of a 43 cm screen
		final double bigScreen = 99.99;
				
		//The price of an antivirus
		final double antivirus = 65.99;
				
		//The cost of a printer
		final double printer = 125.00;
				
		//The screen chosen
		int screen;
				
		//The console waits for the user to choose which screen does they want
		System.out.println("Which screen do you prefer?");
				
		//The first option
		System.out.println("1. A 38 cm screen is " + smallScreen);
				
		//The second option
		System.out.println("2. The 43 cm screen is " + bigScreen);
				
		screen = sc.nextInt();
				
		//The new price after the user has chosen the screen
		switch (screen) {
		
		}

	}

}
