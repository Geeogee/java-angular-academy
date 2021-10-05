package geometricFigures;

/**
 * Classe che gestisce il comportamento
 * di un poligono regolare
 * @author gioel
 *
 */
public class RegularPolygon extends FigureAbstract {
	private int numberSides;
	private double side;
	
	/**
	 * Costruttore del poligono regolare
	 * accetta come parametri il numero dei lati
	 * e la lunghezza del lato
	 * @param numberSides
	 * @param l
	 */
	public RegularPolygon(int numberSides, double l) {
		this.side = l;
		this.numberSides = numberSides;
		
		if(this.side <= 0 || this.numberSides < 3) {
			String message = "Non è possibile creare un poligono regolare con i dati inseriti!";
			throw new IllegalArgumentException(message);
		}
	}
	
	/**
	 * Metodo che restituisce un array
	 * contentente i lati del poligono regolare
	 * 
	 */
	public double[] getSides() {
		// I lati del poligono sono decisi dall'utente
		// quindi l'array avrà una lunghezza variabile
		// che dipende da numberSides
		double[] sides = new double[numberSides];
		// ciclo per riempire l'array
		// con la lunghezza del lato fornito 
		// dall'utente
		for(int i=0; i<this.numberSides; i++) {
			sides[i] = this.side;
		}
		
		return sides;
	}
	
	/**
	 * Metodo che restituisce l'area del poligono regolare
	 * @return l'area del poligono regolare
	 */
	public double area() {
		double perimeter = perimeter();
		// Formula per calcolare il numero fisso
		double fixedNumber = 1 / (2 * Math.tan(Math.PI / numberSides));
		double apothem = fixedNumber * side;
		return (perimeter * apothem) / 2;
	}

}
