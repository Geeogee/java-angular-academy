//DESCRIZIONE
//Programma che simula il gioco della tombola tra n-giocatori e stampa il vincitore.

package tombola;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;

public class Tombola {

	public static int[][] genPlayerNumbers(int players) {
		int[][] playerNumbers = new int[players][15];	
		
		for(int i=0; i<players; i++) {
			Random random = new Random();
			// Uso Set perché non ammette duplicati
			Set<Integer> uniqueNumbers = new HashSet<>();
			while (uniqueNumbers.size() < 15) {
				int randomNumber = random.nextInt(90) + 1;
				uniqueNumbers.add(randomNumber);
			}
			
			int j = 0;
			for (Integer k : uniqueNumbers){
				playerNumbers[i][j] = k;
			    j++;
			}
		}
		
		return playerNumbers;
	}

	
	public static int[] checkWinner(int[][] playerNumbers, int players, int[] scores) {
		boolean winner = false;
		// Estrae numeri fino a quando non c'è un vincitore (score 15)
		while(!winner) {
			Random random = new Random();
			int extractedNumber = random.nextInt(90) + 1;
			for(int i=0; i<players; i++) {
				for(int j=0; j<15; j++) {
					if(playerNumbers[i][j] == extractedNumber) {
						scores[i]++;
					}
				}
			}
			
			for(int i=0; i<scores.length; i++) {
				if(scores[i] == 15) {
					winner = !winner;
				}
			}
		}
		
		return scores;
	}
	
	public static void main(String args[]) {
		
		// Definisco il numero di giocatori
		// Controllo che l'utente non inserisca un numero minore di 2
		int players;
		do {
			System.out.println("Scegli il numero di giocatori:");
			Scanner inputPlayers = new Scanner(System.in);
			players = inputPlayers.nextInt();
		} while (players < 2);
		
		int[][] matrixPlayers = genPlayerNumbers(players);
		int winnerID = 0;
		int[] loosers = new int[players-1];
		int[] scores = new int[players];
		String winningString = "";
		String losingString = "";
		
		// Riempio di 0 tanti quanti sono i giocatori
		// per avere un check successivamente
		for(int i=0; i<scores.length; i++) {
			scores[i] = 0;
		}
		
		// Stampo le cartelle dei giocatori
		for(int i=0; i<players; i++) {
			System.out.println(Arrays.toString(matrixPlayers[i]));
		}
		
		// Controllo il vincitore
		int[] extractionResults = checkWinner(matrixPlayers, players, scores);
		
		// Genero la stringa per la vincita e quelle per le perdite
		for(int i=0; i<extractionResults.length; i++) {
			if (extractionResults[i] == 15) {
				winnerID = i+1;
				winningString = "Vince il Giocatore " + winnerID + "!";
			} else {
				int points = 15 - extractionResults[i];
				if (points == 1) {
					losingString += "\nAl Giocatore " + ((int) i+1) + " mancava " + points + " solo punto!";
				} else {
					losingString += "\nAl Giocatore " + ((int) i+1) + " mancavano " + points + " punti!";
				}
				
			}
		}
		
		System.out.println(winningString + losingString);	
	}
}
