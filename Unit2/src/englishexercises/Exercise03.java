package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner (System.in);
		
		int mirrorHour;
		int mirrorMin;
		
		int realHour;
		int realMin = 0;
		
		System.out.println("Introduce the hour that you are seeing in the mirror:");
		mirrorHour = sc.nextInt();
		mirrorMin = sc.nextInt();
		
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
		
		//realHour = (mirrorMin == 0)? (12 - mirrorHour) : (11 - mirrorHour);
		//realMin = (mirrorMin == 0)? 0 : 60-mirrorMin;
		
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
