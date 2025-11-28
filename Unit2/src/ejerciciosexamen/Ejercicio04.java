package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number introduced by the user/The size of the side
		int side;
		
		//The number of spaces at the beginning of every row
		int space;
		
		//The number of spaces of the low part
		int lowSpace;
		
		//The number of asterisks drawn
		int asterisk;
		
		//The number of asterisks of the low part
		int lowAst;
		
		//The console waits for the user to introduce a size
		System.out.println("Introduzca el tamaño del lado del hexágono:");
		side=sc.nextInt();
		
		//PARTE SUPERIOR DEL HEXÁGONO
		//From the first row until the middle one
		for (int i=1; i<side; i++) {
			space = side - 1 - i;
			
			asterisk = side + 2*i;
			
			//The initial spaces are shown in the console
			for (int currentSpace = 1; currentSpace <= space; currentSpace++) {
				System.out.print(" ");
			}
			
			//The asterisks are shown in the console
			for (int currentAst = 1; currentAst <= asterisk; asterisk++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//LOW PART OF THE HEXAGONE
		//We start from the side-2 to not repeat the middle row
		for (int j=side-2; j>=0; j--) {
			lowSpace = side - 1 - j;
			
			lowAst = side + 2*j;
			
			for(int currentLowSp = 0; currentLowSp < lowSpace; currentLowSp--) {
				System.out.print(" ");
			}
			
			for (int currentLowAst = 0; currentLowAst < lowAst; currentLowAst++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Close Scanner
		sc.close();
		

	}

}
