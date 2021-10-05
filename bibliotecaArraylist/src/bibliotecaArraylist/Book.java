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

public class Book {
	
	private String bookName;
	private int bookCode;
	private User userBorrower;
	
	public Book(String _bookName, int _bookCode) {
		this.bookName = _bookName;
		this.bookCode = _bookCode;
	}
	
	public String getTitle() {
		return bookName;
	}
	
	public int getCode() {
		return bookCode;
	}
	
	public void setUserBorrower(User user) {
		this.userBorrower = user;
	}
	
	@Override
	public String toString() {
		return bookName;
	}
}
