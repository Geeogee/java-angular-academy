package geometricFigures;

/**
 * Classe astratta che implementea
 * la funzionalità del calcolo del perimetro
 * 
 * @author gioel
 *
 */
public abstract class FigureAbstract implements GeometricFigureInterface {
	
	// perimetro = somma dei lati
	// Legge l'array contenente le lunghezze dei lati
	// E li somma fra loro
	public double perimeter() {
		double perimeter = 0;
		double[] sides = getSides();
		for(int i=0; i<sides.length; i++) {
			perimeter += sides[i];
		}
		
		return perimeter;
	};
	
	// Riceve l'array delle lunghezze dei lati
	public abstract double[] getSides();
}
