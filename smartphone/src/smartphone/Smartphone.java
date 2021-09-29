//Progettare una classe di nome Cellulare, per rappresentare un telefono cellulare
//con contratto a ricarica.
//Tale classe prevede due variabili d'istanza. 
//La prima variabile d'istanza e' definita come private double carica, e rappresenta il quantitativo di euro
//disponibile per le chiamate. 
//La seconda variabile d'istanza e' definita come private int numeroChiamate, e rappresenta il numero di chiamate effettuate con
//il cellulare. 
//La classe deve implementare un costruttore public Cellulare(double unaCarica), che prende come parametro esplicito la quantita' di euro della
//ricarica iniziale. 
//Un metodo definito come public void ricarica(double unaRicarica), che ricarica il telefonino.
//Un metodo definito come public void chiama(double minutiDurata), che effettua una chiamata di durata in minuti specificata dal parametro esplicito.
//Tale metodo dovra' aggiornare la carica disponibile, ed incrementare la memoria
//contenente il numero di chiamate effettuate dal telefonino. Si assuma un costo
//di 0.20 euro per ogni minuto di chiamata. Un metodo public double numero404(),
//che restituisce il valore della carica disponibile. 
//Un metodo public intgetNumeroChiamate(), che restituisce il valore della variabile d'istanza
//numeroChiamate. 
//Infine, un metodo public void azzeraChiamate(), che azzera la
//variabile contenente il numero di chiamate effettuate dal telefonino.

package smartphone;

public class Smartphone {
	
	// Variabili di istanza
	private double charge;
	private int callsMade = 0;
	static final double CALL_RATE = .2;
	
	// Constructor
	public Smartphone(double initalCharge) {
		charge = initalCharge;
	}
	
	public int getCallsMade() {
		return callsMade;
	}
	
	public double getRecharge() {
		return charge;
	}
	
	public void recharge(double phoneChargeAmount) {
		charge += phoneChargeAmount;
		System.out.println("Grazie per aver effettuato la ricarica!");
	}
	
	public void call(double callLength) {
		if (charge > 0) {
			double minutes = (int) callLength;
			double callPrice = minutes * CALL_RATE;
			charge -= callPrice;
			callsMade++;
		} else {
			System.out.println("Credito disponibile non sufficiente!");
			System.out.println("Effettui una ricarica per continuare a chiamare!");
		}
	}
	
	public void number404() {
		if (charge <= 0)
			charge = 0;
		System.out.println("Il suo credito residuo è: €" + Math.round(charge * 100.0) / 100.0);
	}
	
	public void resetCalls() {
		callsMade = 0;
		
	}
}
