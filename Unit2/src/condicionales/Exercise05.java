package condicionales;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The price per kilometer
		final double KM_PRICE;
		
		//The distance that the user is going to travel
		double distance;
		
		//The days of stay of the user
		int days;
		
		//The ticket's price
		double price;
		
		//The console waits for the user to introduce the distance that they are going to travel and the days of stay
		System.out.println("Introduzca la distancia que va a recorrer (en km):");
		distance = sc.nextDouble();
		
		System.out.println("Ahora introduzca cuántos días va a durar su estancia:");
		days = sc.nextInt();
		
		//Depending of how long is the distance or how long is their stay, a discount would be applied or not
		if (days>7 || distance>800) {
			price = distance*1.75;
		} else {
			price = distance*2.5;
		}
		
		//The price of the ticket is shown in the console
		System.out.println("El precio del billete de tren será de " + price);
		
		//Close Scanner
		sc.close();

	}

}
