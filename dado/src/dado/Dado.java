//Scrivere un programma che usi la classe Random per simulare il lancio di un
//dado, visualizzando un numero casuale compreso tra 1 e 6 ogni volta che viene
//eseguito.

package dado;
import java.util.Random;

public class Dado {
	
	private int faces;
	private Random random;
	
	public Dado(int n) {
		faces = n;
		random = new Random();
	}
	
	public int throwDice() {
		return random.nextInt(faces) + 1;
	}
}
