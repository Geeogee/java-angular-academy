package biblioteca;
import java.util.Scanner;

public class biblioTesting {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di pagine del libro:");
		int pages = input.nextInt();
		Libro book1 = new Libro(pages);
		
		System.out.println("Inserisci il numero di pagine del Vocabolario:");
		pages = input.nextInt();
		System.out.println("Inserisci il numero di definizioni del Vocabolario:");
		int definitions = input.nextInt();
		Vocabolario book2 = new Vocabolario(pages, definitions);
		
		book1.pageMessage();
		book2.pageMessage();
	}
}
