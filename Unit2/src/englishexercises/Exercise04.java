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
		System.out.println("Introduce the amount of money the client has paid:");
		centsGiv = sc.nextInt();
		
		//The result of the change
		change = centsGiv - centsReq;
		
		//We want to calculate the change with the least number of coins
		if (change == 1) {
			oneCent = change/1;
		} else if (change == 2) {
			twoCent = change/2;
		} else if (change <= 5) {
			fiveCent = change/5;
			twoCent = change/2;
			oneCent = (change%2)/1;
		} else if (change <= 10) {
			tenCent = change/10;
			fiveCent = change/5;
			twoCent = (change%5)/2;
			oneCent = ((change%5)%2)/1;
		} else if (change <= 20) {
			twentyCent = change/20;
			tenCent = change/10;
			fiveCent = (change%10)/5;
			twoCent = ((change%10)%5)/2;
			oneCent = (((change%10)%5)%2)/1;
		} else if (change <= 50) {
			fiftyCent = change/50;
			twentyCent = change/20;
			tenCent = (change%20)/10;
			fiveCent = ((change%20)%10)/5;
			twoCent = (((change%20)%10)%5)/2;
			oneCent = ((((change%20)%10)%5)%2)/1;
		} else if (change <= 100) {
			oneEuro = change/100;
			fiftyCent = change/50;
			twentyCent = (change%50)/20;
			tenCent = ((change%50)%20)/10;
			fiveCent = (((change%50)%20)%10)/5;
			twoCent = ((((change%50)%20)%10)%5)/2;
			oneCent = (((((change%50)%20)%10)%5)%2)/1;
		} else if (change <= 200) {
			twoEuro = change/200;
			oneEuro = change/100;
			fiftyCent = (change%100)/50;
			twentyCent = ((change%100)%50)/20;
			tenCent = (((change%100)%50)%20)/10;
			fiveCent = ((((change%100)%50)%20)%10)/5;
			twoCent = (((((change%100)%50)%20)%10)%5)/2;
			oneCent = ((((((change%100)%50)%20)%10)%5)%2)/1;
		} else {
			twoEuro = change/200;
			oneEuro = (change%200)/100;
			fiftyCent = ((change%200)%100)/50;
			twentyCent = (((change%200)%100)%50)/20;
			tenCent = ((((change%200)%100)%50)%20)/10;
			fiveCent = (((((change%200)%100)%50)%20)%10)/5;
			twoCent = ((((((change%200)%100)%50)%20)%10)%5)/2;
			oneCent = (((((((change%200)%100)%50)%20)%10)%5)%2)/1;
		}
		
		//The necessary coins are shown in the console
		System.out.println("The change is "+twoEuro+" "+oneEuro+" "+fiftyCent+" "+twentyCent+" "+tenCent+" "+fiveCent+" "+twoCent+" "+oneCent);
		
		//Close Scanner
		sc.close();

	}

}
