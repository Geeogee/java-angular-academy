//Implementare una interfaccia che rappresenti le Figure Geometriche
//
//Esporre un method per il perimetro ed un altro per l’area.
//
//Implementare almeno 5 figure distinte con almeno un triangolo 
//(generico, proprietà della somma dei lati?) ed una circonferenza, poligono regolare con n lati ( numero da input). ---> SubClassi 
//
//
//Successivamente valutare il riutilizzo del codice, 
//implementando una classe astratta che generalizzi il codice comune, per quanto possibile.
//
//(ad esempio che calcoli il perimetro e/o area per la classe astratta)


package geometricFigures;


/**
 * Interfaccia che definisce il comportamento base di una figura geometrica
 * e quindi la possibilità di calcolare area e perimetro
 * @author gioel
 *
 */
public interface GeometricFigureInterface {
	
	/**
	 * Metodo che calcola l'area
	 * 
	 * @return l'area del poligono
	 */
	public double area();
	
	/**
	 * Metodo che calcola il perimetro
	 * 
	 * @return il perimetro del poligono
	 */
	public double perimeter();
}
