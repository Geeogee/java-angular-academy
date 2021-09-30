//Creare un file.txt che stampi all'interno il 
//contenuto di nomi_italiani.txt al contrario

package files;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class nameReverse extends createFile {
	
	public static void reverseFile(String filename) {
		String pathFileToReverse = "C:/Users/gioel/Desktop/nomi_italiani.txt";
		Scanner input = new Scanner(System.in);
		ArrayList<String> lines = new ArrayList<String>();
		
		try {
			File file = new File(pathFileToReverse);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine()) != null) {
				lines.add(line);
			}
			
			Collections.reverse(lines);
			String path = "C:/Users/gioel/Desktop/" + filename + ".txt";
			File fileEnd = new File(path);
			FileWriter fw = new FileWriter(fileEnd);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(String l : lines) {
				bw.write(l + "\n");
			}
			
			bw.flush();
			bw.close();
			
			System.out.println("File invertito!");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	 
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scegli il nome per un file:");
		String filename = input.nextLine();
		newFile(filename);
		reverseFile(filename);
	}
}
