package bibliotecaArraylist;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Biblioteca {
	
	private HashSet<User> users;
//	private HashSet<Book> books;
	
	private HashMap<Integer, Book> books;
	
	
	public Biblioteca() {
		users = new HashSet<User>(0);
//		books = new HashSet<Book>(0);
		books = new HashMap<Integer, Book>(0);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(books, users);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biblioteca other = (Biblioteca) obj;
		return Objects.equals(books, other.books) && Objects.equals(users, other.users);
	}

	public void addUser(String firstname, String lastname) {
		User user = new User(firstname, lastname);
		users.add(user);
	}
	
	public void addBook(String title, int code) {
		Book book = new Book(title, code);
		Integer key = code;
		books.put(key, book);
	}
	
	public void borrowBook(int code, String lastname) {
		Book book = searchCode(code);
		User user = searchUser(lastname);
		if (book == null || searchUser(lastname) == null) {
			System.out.println("I dati inseriti sono errati!");
		} else {
			book.setUserBorrower(user);
			System.out.println("L'utente " + lastname + " ha preso il libro " + book.getTitle() + " [#" + book.getCode() +"] in prestito.");
		}
	}
	
	// Ritorna il libro se presente
	// Altrimenti null
	public Book searchCode(int code) {
		
		// Per iterare su un HashMap
		// posso o creare una collection con i suoi valori
		// ed iterare quelli
		
//		Collection<Book> searchBooks = books.values();
//		Iterator<Book> it = searchBooks.iterator();
//		while(it.hasNext()) {
//			Book book = it.next();
//			if(book.getCode() == code) {
//				return book;
//			}
//		}
		
		// oppure usare il metodo keySets() ed iterare le chiavi
		Iterator<Integer> it = books.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			if(key == code) {
				return books.get(key);
			}
		}
		
//		if(books.containsKey(code)) {
//			return books.get(code);
//		}
		
		return null;
	}
	
	// Ritorna l'utente se presente
	// altrimenti ritorna null
	public User searchUser(String lastname) {

		Iterator<User> it = users.iterator();
		while(it.hasNext()) {
			User user = it.next();
			if(user.getLastname().equals(lastname)) {
				return user;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "Utenti: " + users + "\nLibri: " + books;
	}
}
