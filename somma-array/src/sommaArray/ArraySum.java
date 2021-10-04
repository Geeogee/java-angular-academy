//Scrivi un programma che accetti in
//input due array di interi (arrayA e
//arrayB) di 5 posti ciascuno e scriva
//su file txt la loro somma elemento
//per elemento; in seguito caricare il
//file salvato in un array
//arraySomma (avente la stessa
//dimensione dei due precedenti) e
//stamparlo a video.

package sommaArray;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ArraySum {
	private static Random random = new Random();
	private static Scanner input = new Scanner(System.in);
	
	public static void writeArraySum(int[] arr1, int[] arr2, File file) {
		
		// Carico l'array con numeri random 
		for(int i=0; i<5; i++) {
			arr1[i] = genRandomNumber(20, 1);
			arr2[i] = genRandomNumber(20, 1);
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		writeFile(arr1, arr2, file);
	}
	
	public static int genRandomNumber(int max, int min) {
		int number = random.nextInt(max - min + 1) + 1;
		return number;
	}
	
	public static void writeFile(int[] arr1, int[] arr2, File file) {
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			int sum;
			for(int i=0; i<5; i++) {
				sum = arr1[i] + arr2[i];
				// Scrivo il valore nel file
				// in formato stringa
				// vedere write() in documentazione
				bw.write(String.valueOf(sum) + "\n");
			}
			
			bw.close();
			bw.flush();
			
		} catch(IOException e) {
			e.getStackTrace();
		}
	}
	
	public static String[] getArraySum(File file) {
		String[] arraySum = new String[5];
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			int i = 0;
			// Leggo la linea fino a quando non è nulla
			// e la carico nell'array delle somme
			while((line = br.readLine()) != null) {
				arraySum[i] = line;
				i++;
			}
			
			br.close();
			
		} catch(IOException e) {
			e.getStackTrace();
		}
		
		return arraySum;
	}
	
	public static File newFile(String filename) {
		File file = null;
		// !!! IMPORTANTE !!! CAMBIA IL PATH !!!
		String path = "C:/Users/gioel/Desktop/" + filename + ".txt";
		try {
			file = new File(path);
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
		
		return file;
	}
	
	public static void main(String args[]) {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		
		System.out.println("Scegli il nome del file");
		String filename = input.nextLine();
		File file = newFile(filename);
		writeArraySum(array1, array2, file);
		String[] arraySum = getArraySum(file);
		System.out.println(Arrays.toString(arraySum));
	}
}
