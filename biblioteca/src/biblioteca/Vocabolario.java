package biblioteca;

public class Vocabolario extends Libro {
	
	private int numDefinitions;
	private String String;
	private static String bookType = "Vocabolario";
	
	public Vocabolario(int pages, int definitions) {
		super(pages);
		this.numDefinitions = definitions;
	}

	public int getNumPages() {
		return super.getNumPages();
	}
	
	public String getBookType() {
		return bookType;
	}

	public void pageMessage() {
		super.pageMessage();
		System.out.println("Numero definizioni Vocabolario: " + numDefinitions);
		int defAverage = numDefinitions / getNumPages();
		System.out.println("Media definizioni per pagina Vocabolario: " + defAverage);
	}
	
//	public void definitionMessage() {
//		System.out.println("Numero pagine Vocabolario: " + getNumPages());
//		System.out.println("Numero definizioni Vocabolario: " + numDefinitions);
//		int defAverage = numDefinitions / getNumPages();
//		System.out.println("Media definizioni per pagina Vocabolario: " + defAverage);
//	}
}
