package bucles;

import java.util.Scanner;

public class AssertExcpPrueba {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Introduzca una hora válida");
		hora = sc.nextInt();
		
		assert hora>0 && hora<24 : "La hora debe ser un valor entre 0 y 23";
		
		//Close Scanner
		sc.close();

	}

}
