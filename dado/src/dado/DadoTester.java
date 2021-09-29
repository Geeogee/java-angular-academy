package dado;
import java.util.Scanner;

public class DadoTester {
	
	public static void main(String args[]) {
		
		Dado dice = new Dado(6);
		
		System.out.println("Quante volte vuoi lanciare il dado?");
		Scanner input = new Scanner(System.in);
		int numberThrows = input.nextInt();
		
		for(int i=0; i<numberThrows; i++) {
			System.out.println(dice.throwDice());
		}
	}
}
