package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		//The hour reflected
		int mirrorHour;
		
		//The minute reflected
		int mirrorMin;
		
		//The real hour
		int realHour;
		
		//The real minutes
		int realMin = 0;
		
		//The console waits for the user to introduce what time is being reflected in the mirror
		System.out.println("Introduce the hour that you are seeing in the mirror:");
		mirrorHour = sc.nextInt();
		
		System.out.println("Introduce the minutes that you are seeing in the mirror:");
		mirrorMin = sc.nextInt();
		
		//From the time reflected, we want to know the real time
		if (mirrorMin == 0) {
			if (mirrorHour == 12) {
				realHour = 12;
			} else {
				realHour = 12 - mirrorHour;
				realMin = 0;
			}
		} else {
			realHour = 11 - mirrorHour;
			realMin = 60 - mirrorMin;
		}
		
		if (realHour < 10) {
			System.out.println("0");
		}
		System.out.println(realHour + ":");
		
		if (realMin<10) {
			System.out.println("0");
		}
		System.out.println(realMin);
		
		//Close Scanner
		sc.close();
	}

}
