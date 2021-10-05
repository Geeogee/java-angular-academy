package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection {
	public static void main(String args[]) {
		
		// ArrayList
		
//		ArrayList<Persona> lista = new ArrayList<Persona>(0);
//		lista.add(new Persona(27, "Marco", "Bianco"));
//		lista.add(new Persona(33, "Gioele", "Rosso"));
//		lista.add(new Persona(44, "Mario", "Verde"));
//		lista.add(new Persona(55, "Luigi", "Giallo"));
//		
//		Iterator<Persona> it = lista.iterator();
//		while(it.hasNext()) {
//			Persona p = it.next();
//			System.out.println(p.getFirstname());
//		}
//		
//		for(int i=0; i<lista.size(); i++) {
//			Persona p = lista.get(i);
//			System.out.println(p.getFirstname());
//		}
		
		// LinkedList
		
//		LinkedList<Persona> lista = new LinkedList<Persona>();
//		lista.add(new Persona(27, "Marco", "Bianco"));
//		lista.add(new Persona(33, "Gioele", "Rosso"));
//		lista.add(new Persona(44, "Mario", "Verde"));
//		lista.add(new Persona(55, "Luigi", "Giallo"));
//		
//		Iterator<Persona> it = lista.iterator();
//		while(it.hasNext()) {
//			Persona p = it.next();
//			System.out.println(p.getFirstname());
//		}
//		
//		for(int i=0; i<lista.size(); i++) {
//			Persona p = lista.get(i);
//			System.out.println(p.getFirstname());
//		}
		
		HashSet<Persona> hash = new HashSet<Persona>(0);
		hash.add(new Persona(27, "Marco", "Bianco"));
		hash.add(new Persona(33, "Gioele", "Rosso"));
		hash.add(new Persona(44, "Mario", "Verde"));
		hash.add(new Persona(55, "Luigi", "Giallo"));
		
		Iterator<Persona> it = hash.iterator();
		while(it.hasNext()) {
			Persona p = it.next();
			System.out.println(p.getFirstname());
		}
		
		System.out.println("\n");
		for(Persona p : hash) {
			System.out.println(p.getFirstname());
		}
	}
}
