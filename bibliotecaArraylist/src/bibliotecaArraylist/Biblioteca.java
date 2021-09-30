package bibliotecaArraylist;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<User> users;
	private ArrayList<Book> books;
	
	public Biblioteca() {
		users = new ArrayList<User>(0);
		books = new ArrayList<Book>(0);
	}
	
	public void addUser(String firstname, String lastname) {
		User user = new User(firstname, lastname);
		users.add(user);
	}
	
	public void addBook(String title, int code) {
		Book book = new Book(title, code);
		books.add(book);
	}
	
	public void borrowBook(int code, String lastname) {
		if (searchCode(code) == -1 || searchUser(lastname) == -1) {
			System.out.println("I dati inseriti sono errati!");
		} else {
			books.get(code).setUserBorrower(users.get(searchUser(lastname)));
			System.out.println("L'utente " + lastname + " ha preso il libro " + code + " in prestito.");
		}
	}
	
	public int searchCode(int code) {
		int res = -1;

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getCode() == code) {
				res = i;
			}
		}

		return res;
	}
	
	// ritorna la posizione dell'utente(se presente, altrimenti -1)
	public int searchUser(String lastname) {
		int res = -1;

		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLastname().equals(lastname)) {
				res = i;
			}
		}

		return res;
	}
	
	@Override
	public String toString() {
		return "Utenti: " + users + "\nLibri: " + books;
	}
}
