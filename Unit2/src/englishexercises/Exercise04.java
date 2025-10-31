package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The cents that the client have to pay
		int centsReq;
		
		//The cents that the client ends up giving
		int centsGiv;
		
		//The change
		int change;
		
		//The amount of 2 euro coins in the change
		int twoEuro=0;
		
		//The amount of 1 euro coins in the change
		int oneEuro=0;
		
		//The amount of 50 cents coins in the change
		int fiftyCent=0;
		
		//The amount of 20 cents coins in the change
		int twentyCent=0;
		
		//The amount of 10 cents coins in the change
		int tenCent=0;
		
		//The amount of 5 cents coins in the change
		int fiveCent=0;
		
		//The amount of 2 cents coins in the change
		int twoCent=0;
		
		//The amount of 1 cents coins in the change
		int oneCent=0;
		
		//The console waits for the user to introduce the money that the client has to pay
		System.out.println("Introduce the money that the client must pay:");
		centsReq = sc.nextInt();
		
		//The console waits for the user to introduce the money that the client has paid
		centsGiv = sc.nextInt();
		
		//The result of the change
		change = centsGiv - centsReq;
		
		//We want to calculate the change with the least number of coins
		if (change<=1) {
			oneCent = change/1;
			System.out.println("The change is "+twoEuro+" "+oneEuro+" "+fiftyCent+" "+twentyCent+" "+tenCent+" "+fiveCent+" "+twoCent+" "+oneCent);
		} else if (change<=2) {
			twoCent = change/2;
			System.out.println("The change is "+twoEuro+" "+oneEuro+" "+fiftyCent+" "+twentyCent+" "+tenCent+" "+fiveCent+" "+twoCent+" "+oneCent);
		} else if (change<=5) {
			fiveCent = change/5;
			twoCent = change/2;
		}

	}

}
