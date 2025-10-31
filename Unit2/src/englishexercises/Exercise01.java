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
		
		//The value of the price after choosing a screen
		double midPrice=0;
		
		//The value of the final price
		double finalPrice=0;
		
		//The extra chosen
		int extra;
				
		//The console waits for the user to choose which screen does they want
		System.out.println("Which screen do you prefer?");
		System.out.println("1. A 38 cm screen is " + smallScreen);
		System.out.println("2. The 43 cm screen is " + bigScreen);
				
		screen = sc.nextInt();
		
		//The new price after the user has chosen the screen
		switch (screen) {
		case 1-> midPrice = basicSystem + smallScreen;
		case 2-> midPrice = basicSystem + bigScreen;
		}
		
		//Then, we ask the user if they want any of the extras
		System.out.println("Do you want any extra?");
		System.out.println("1. An antivirus software is " + antivirus);
		System.out.println("2. A printer is " + printer);
		System.out.println("3. Continue without any extra");
		
		extra = sc.nextInt();
		
		//The price after the user has chosen the extra
		switch (extra) {
		case 1-> finalPrice = midPrice + antivirus;
		case 2-> finalPrice = midPrice + printer;
		case 3-> finalPrice = midPrice;
		}
		
		//The final price is shown in the console
		System.out.println("For all the options chosen, you have to pay " + finalPrice + " for the PC");
		
		//Close Scanner
		sc.close();

	}

}
