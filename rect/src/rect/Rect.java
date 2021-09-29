//Si costruisce un rettangolo partendo da una base, un’altezza, calcolare area e perimetro (con le classi)

package rect;

public class Rect {
	
	private double base;
	private double altezza;
	
	// Constructor
	public Rect(double b, double h) {
		this.base = b;
		this.altezza = h;
	}
	
	public double getArea() {
		return base * altezza;
	}
	
	public double getPerimetro() {
		return (base + altezza) * 2;
	}
}
