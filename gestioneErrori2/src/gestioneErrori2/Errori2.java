package gestioneErrori2;
//Gestire l'eccezione generata dal codice

public class Errori2 {

	public static void main(String[] args) {
		
		try {
			
			int[] T = null;
			T[0] = 7;
			System.out.println(T[0]);
		} catch (Exception e) {
			System.out.println("Null Pointer Exception");
		}
		
	}

}
