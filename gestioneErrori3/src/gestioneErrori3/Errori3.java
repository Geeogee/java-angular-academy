//Scrivi un programma che inserito un numero intero 
//da tastiera stampi a video il risultato della divisione di tale numero 
//per un altro numero generato casualmente, 
//compreso fra 0 e 3, intercettando l'eventuale eccezione della divisione per 0.


package gestioneErrori3;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Errori3 {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Inserisci un numero:");
		int dividend = input.nextInt();
		int divisor = random.nextInt(4);
		int result;
		
		try {
			result = dividend / divisor;
			System.out.println("Divisore: " + divisor);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Non puoi dividere un numero per 0.");
		} 
		
	}
}
