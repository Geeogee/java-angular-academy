package geometricFigures;

/**
 * Classe che gestisce il comportamento
 * di un triangolo
 * @author gioel
 *
 */
public class Triangle extends FigureAbstract {
	
	private double base;
	private double side1;
	private double side2;
	
	/**
	 * Costruttore del triangolo
	 * 
	 * @param base
	 * @param l2
	 * @param l3
	 */
	public Triangle(double base, double l2, double l3) {
		this.base = base;
		this.side1 = l2;
		this.side2 = l3;
		
		
		// Controllo la disugliaglianza triangolare
		// Nel caso in cui non sia possibile costruire il triangolo
		// Con i dati forniti, verrà lanciata un'eccezione
		boolean isTriangle = this.base < this.side1 + this.side2;
		if(!isTriangle) {
			String message = "Lati non triangolari";
			throw new IllegalArgumentException(message);
		}
		
		// Controllo che i lati del triangolo
		// non abbiamo una lunghezza minore o uguale a 0
		if (this.base <= 0 || this.side1 <= 0 || this.side2 <= 0) {
			String message = "Non puoi inserire un numero minore o uguale a 0 come lunghezza dei lati!";
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * Metodo che gestisce i lati della figura creata
	 * @return l'array contenente i lati del triangolo
	 */
	public double[] getSides() {
		double[] sides = {base, side1, side2};
		return sides;
	}
	
	public double area() {
		
		/**
		 * Metodo per calcolare l'area 
		 * @return l'area del triangolo
		 */
		double semiPerimeter = perimeter() / 2;
		// Formula di Erone
		double area = Math.sqrt(semiPerimeter * (semiPerimeter - this.base) * (semiPerimeter - this.side1) * (semiPerimeter - this.side2));
		return area;
	}
	
}
