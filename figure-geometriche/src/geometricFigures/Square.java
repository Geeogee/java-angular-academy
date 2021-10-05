package geometricFigures;

/**
 * Classe che definisce il comportamento 
 * di un quadrato
 * @author gioel
 *
 */
public class Square extends FigureAbstract {
	
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	/**
	 * Costruttore del quadrato
	 * Accetta come parametro il lato
	 * @param l
	 */
	public Square(double l) {
		double side = l;
		this.side1 = this.side2 = this.side3 = this.side4 = side;
		
		// Controllo il dato inserito
		// dall'utente
		if(side <= 0) {
			String message = "Il lato non può avere una lunghezza minore o uguale a 0!";
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * Metodo che gestisce i lati della figura creata
	 * @return l'array contenente i lati del quadrato
	 */
	public double[] getSides() {
		double[] sides = {side1, side2, side3, side4};
		return sides;
	}
	
	/**
	 * Metodo per calcolare l'area
	 * @return l'area del quadrato
	 */
	public double area() {
		return Math.pow(this.side1, 2);
	}
	
}
