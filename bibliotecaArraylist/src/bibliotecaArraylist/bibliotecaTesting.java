//Una biblioteca vorrebbe creare un piccolo database dei suoi donatori libri, dei libri donati e per i prestiti. I donatori avranno nome/cognome, libri: titolo e 
//codice(createlo voi manualmente a 3 cifrem). Alla voce database dovrà apparire un'arraylist che stampi tutte le informazioni sui prestiti(cognome, codice libro 
//e titolo libro). 
//
//CONSIGLIO: 		System.out.println("1) aggiungi un utente");
//			System.out.println("2) aggiungi un libro");
//			System.out.println("3) crea un prestito");
//			System.out.println("4) stampa il contenuto della biblioteca");
//			System.out.println("5) esci");

package bibliotecaArraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class bibliotecaTesting {

	public static void printMenu() {
		System.out.println("| --------------------------------------- |");
		System.out.println("| 1. Aggiungi un Utente                   |");
		System.out.println("| 2. Aggiungi un Libro                    |");
		System.out.println("| 3. Crea un prestito                     |");
		System.out.println("| 4. Stampa il contenuto della biblioteca |");
		System.out.println("| 5. Esci                                 |");
		System.out.println("| --------------------------------------- |");
	}
	
	public static void main(String args[]) {
		
		Biblioteca biblioteca = new Biblioteca();
		Scanner input = new Scanner(System.in);
		String firstname;
		String lastname;
		String bookName;
		int bookCode;
		
		boolean exit = false;
		int select;

		do {
			printMenu();
			select = input.nextInt();
			input.nextLine();
			
			switch(select) {
				case 1:
					System.out.println("Inserisci il nome:");
					firstname = input.nextLine();
					System.out.println("Inserisci il cognome: ");
					lastname = input.nextLine();
					biblioteca.addUser(firstname, lastname);
					break;
					
				case 2:
					System.out.println("Inserisci il nome del libro: ");
					bookName = input.nextLine();
					System.out.println("Inserisci il codice del libro:");
					bookCode = input.nextInt();
					input.nextLine();
					biblioteca.addBook(bookName, bookCode);
					break;
				
				case 3:
					System.out.println("Inserisci il tuo cognome:");
					lastname = input.nextLine();
					System.out.println("Inserisci il codice del libro da prendere in prestito:");
					bookCode = input.nextInt();
					input.nextLine();
					biblioteca.borrowBook(bookCode, lastname);
					break;
				
				case 4:
					System.out.println("Ecco il contenuto della biblioteca:");
					System.out.println(biblioteca.toString());
					break;
				
				case 5:
					System.out.println("Arrivederci!");
					exit = true;
					break;
			}
			
		} while (!exit);
		
	}
}
