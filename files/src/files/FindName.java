package files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindName {

	public static void searchName() {
		String path = "C:/Users/gioel/Desktop/nomi_italiani.txt";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il nome da cercare:");
		String name = input.nextLine();
		
		try {
			File file = new File(path);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			boolean found = false;
			int count = 0;
			while((line = br.readLine()) != null && !found) {
				if(line.equalsIgnoreCase(name)) {
					found = !found;
					System.out.println("Nome trovato! Riga: " + count );
				}
				count++;
			}
			
			if(!found) {
				System.out.println("Non trovato!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		searchName();
	}
}
