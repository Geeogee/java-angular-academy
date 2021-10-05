package geometricFigures;

/**
 * Metodo che gestisce il comportamento
 * di un rettangolo
 * @author gioel
 *
 */
public class Rectangle extends FigureAbstract {
	
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	/**
	 * Costruttore del rettangolo
	 * accetta come parametri la base e l'altezza
	 * @param b
	 * @param h
	 */
	public Rectangle(double b, double h) {
		double base = b;
		double height = h;
		this.side1 = this.side3 = base;
		this.side2 = this.side4 = height;
		
		if(base <= 0 || height <= 0) {
			String message = "La base e l'altezza non possono avere una lunghezza minore o uguale a 0!";
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * Metodo che gestisce i lati della figura creata
	 * @return l'array contenente i lati del rettangolo
	 */
	public double[] getSides() {
		double[] sides = {side1, side2, side3, side4};
		return sides;
	}
	
	/**
	 * Metodo per calcolare l'area
	 * @return l'area del rettangolo
	 */
	public double area() {
		double base = side1 = side3;
		double height = side2 = side4;
		return base * height;
	}
	
}
