package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class createFile {
	
	public static void newFile(String filename) {
		
		String path = "C:/Users/gioel/Desktop/" + filename + ".txt";
		try {
			File file = new File(path);
			if (file.exists()) {
				System.out.println("Il file esiste già!");
			} else if(file.createNewFile()) {
				System.out.println("Il file è stato creato!");
			} else {
				System.out.println("Il file non può essere creato!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scegli il nome per un file:");
		String filename = input.nextLine();
		newFile(filename);
	}
}
