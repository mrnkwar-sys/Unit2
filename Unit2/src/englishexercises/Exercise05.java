package englishexercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The velocity that the program has to calculate
		double velocity;
		
		//The first type of data introduced
		String firstData;
		
		//The second type of data introduced
		String secondData;
		
		//The first value introduced
		double firstValue;
		
		//The second value introduced
		double secondValue;
		
		//The displacement
		double displace;
		
		//The time
		double time;
		
		//The letter that represents the displacement
		final String DISPLACE = "D";
		
		//The letter that represents the velocity
		final String VELOCITY = "V";
		
		//The letter that represents the time
		final String TIME = "T";
		
		//The console waits for the user to tell what type of data do they want to introduce
		System.out.println("Introduce the type of data:");
		firstData = sc.next().toUpperCase();
		
		//Then, the user introduces the value of the data
		System.out.println("Introduce the value for that data:");
		firstValue = sc.nextDouble();
		
		//After that, the console waits for a different type of data
		System.out.println("Introduce the other type of data:");
		secondData = sc.next().toUpperCase();
		
		//The value of that data
		System.out.println("Introduce the value for that data:");
		secondValue = sc.nextDouble();
		
		//We want to know which data is referring to the displacement, and which one to the time
		if (firstData.equals(DISPLACE) && secondData.equals(TIME)) {
			velocity = firstValue/secondValue;
			System.out.println("The result is V = " + velocity);
		} else if (firstData.equals(DISPLACE) && secondData.equals(VELOCITY)) {
			time = firstValue/secondValue;
			System.out.println("The result is T = " + time);
		} else if (firstData.equals(TIME) && secondData.equals(VELOCITY)) {
			displace = secondValue*firstValue;
			System.out.println("The result is D = " + displace);
		} else if (firstData.equals(TIME) && secondData.equals(DISPLACE)) {
			velocity = secondValue/firstValue;
			System.out.println("The result is V = " + velocity);
		} else if (firstData.equals(VELOCITY) && secondData.equals(TIME)) {
			displace = firstValue*secondValue;
			System.out.println("The result is D = " + displace);
		} else {
			time = secondValue/firstValue;
			System.out.println("The result is T = " + time);
		}
			
		//Close Scanner
		sc.close();

	}

}
