package gestioneErrori1;

public class esercizio1 {
	public static void main(String args[]) {
		String s = null;
		try {
			int i = s.length();
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("Non è possibile ricavare la lunghezza di un null!");
			
		}
	}
}
