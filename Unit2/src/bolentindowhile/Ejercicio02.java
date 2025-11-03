package bolentindowhile;

public class Ejercicio02 {

	public static void main(String[] args) {
		//The pair numbers shown in the console
		int pairNum = 2;
		
		//We want to shown all the pairs numbers between 0 and 200
		do {
			System.out.print(pairNum + ", ");
			pairNum += 2;
		} while (pairNum <= 200);

	}

}
