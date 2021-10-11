package caproespiatorio;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Iterator;

public class CaproEspiatorio {
	
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String args[]) {
		
		Random random = new Random();
		HashMap<Integer, String> javaAcademy  = new HashMap<Integer, String>() {{
		    put(1, "Antonio Pupillo");
		    put(2, "Sara Nelli");
		    put(3, "Federica Rullo");
		    put(4, "Filippo Campailla");
		    put(5, "Alessio Leone");
		    put(6, "Mattia Tiozzo");
		    put(7, "Gioele Armiento");
		    put(8, "Roberto Piccinno");
		    put(9, "Tommaso Serfilippi");
		    put(10, "Valerio Alfinito");
		    put(11, "Simone Palermo");
		    put(12, "Luca Palmarucci");
		}};
		
		int condannato = random.nextInt(11) + 1;
		Integer key;
		Iterator<Integer> it = javaAcademy.keySet().iterator();
		while(it.hasNext()) {
			key = it.next();
			if(key == condannato) {
				System.out.print(ANSI_RED);
			}
			System.out.println(key + ") " + javaAcademy.get(key));
		    System.out.print(ANSI_RESET);
		}  
	}
}
