//Scrivere una classe Libro le cui istanze rappresentano libri. La classe deve
//contenere una variabile di istanza int numPagine, un costruttore che assegna al
//libro un numero specificato di pagine, ed un metodo pageMessage() che stampa il
//numero di pagine del libro, oltre al metodo getter int getNumPagine() che ritorna
//il numero delle pagine.

//Scrivere quindi una classe Vocabolario che estende la classe Libro. La classe deve
//contenere una nuova variabile di istanza, int numDefinizioni, un costruttore che
//assegna al vocabolario un numero di pagine (la stessa variabile di Libro) e un
//numero di definizioni specificati, ed un metodo definitionMessage() che stampa
//un messaggio contenente il numero di pagine, il numero di definizioni ed il
//numero medio di definizioni per pagina del vocabolario.

//Scrivere infine un programma di prova (main) per collaudare le classi e i metodi.

package biblioteca;

public class Libro {
	private int numPages;
	private static String bookType = "Libro";
	
	public Libro(int pages) {
		numPages = pages;
	}
	
	public int getNumPages() {
		return numPages;
	}
	
	public String getBookType() {
		return bookType;
	}
	
	public void pageMessage() {
		System.out.println("Pagine " + getBookType() + ": " + numPages);
	}
}
