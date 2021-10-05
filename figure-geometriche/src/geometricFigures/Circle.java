package geometricFigures;

/**
 * Classe che gestisce il comportamento
 * di un cerchio
 * @author gioel
 *
 */
public class Circle extends FigureAbstract {
	
	private double radius;
	
	/**
	 * Costruttore del cerchio
	 * che accetta come parametro il raggio
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
		
		// Controllo che il valore inserito
		// per il raggio non sia minore o uguale a zero
		if(this.radius <= 0) {
			String message = "Il raggio non può avere una lunghezza minore o uguale a 0!";
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * Metodo per calcolare l'area 
	 * @return l'area del cerchio
	 */
	public double area() {
		return (Math.pow(this.radius, 2) * Math.PI);
	}
	
	/**
	 * Metodo che gestisce i lati della figura creata
	 * @return l'array contenente la circonferenza
	 * del cerchio
	 */
	public double[] getSides() {
		
		double circumference = radius * 2 * Math.PI;
		double[] sides = { circumference };
		return sides;
	}

}
