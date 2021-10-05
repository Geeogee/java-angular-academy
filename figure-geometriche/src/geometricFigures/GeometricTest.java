package geometricFigures;

import java.util.Scanner;

/**
 * Classe che implementa
 * il funzionamento dell'applicazione
 * @author gioel
 *
 */
public class GeometricTest {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Crea una figura geometrica.");
		System.out.println("1. Cerchio");
		System.out.println("2. Triangolo");
		System.out.println("3. Quadrato");
		System.out.println("4. Rettangolo");
		System.out.println("5. Poligono Regolare");
		int select = scanner.nextInt();
		scanner.nextLine();
		
		switch(select) {
			case 1:
				createCircle();
				break;
			
			case 2:
				createTriangle();
				break;
			
			case 3:
				createSquare();
				break;
			
			case 4:
				createRectangle();
				break;
				
			case 5:
				createPolygon();
				break;
				
			default:
				System.out.println("Selezione non valida!");
				break;
		}
	}
	
	public static void createCircle() {
		System.out.println("Inserisci il raggio del cerchio");
		double radius = scanner.nextDouble();
		scanner.nextLine();
		
		Circle circle = new Circle(radius);
		System.out.println("Circonferenza: " + circle.perimeter());
		System.out.println("Area: " + circle.area());
	}
	
	public static void createTriangle() {
		double side1, side2, side3;
		System.out.println("Inserisci i lati del triangolo");
		
		System.out.println("Base:");
		side1 = scanner.nextDouble();
		System.out.println("Lato 1:");
		side2 = scanner.nextDouble();
		System.out.println("Lato 2:");
		side3 = scanner.nextDouble();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		System.out.println("Perimetro: " + triangle.perimeter());
		System.out.println("Area:" + triangle.area());
	}
	
	public static void createSquare() {
		double side;
		System.out.println("Inserisci il lato del quadrato:");
		side = scanner.nextDouble();
		
		Square square = new Square(side);
		System.out.println("Perimetro: " + square.perimeter());
		System.out.println("Area: " + square.area());
	}
	
	public static void createRectangle() {
		double base, height;
		System.out.println("Inserisci la base del rettangolo:");
		base = scanner.nextDouble();
		System.out.println("Inserisci l'altezza del rettangolo:");
		height = scanner.nextDouble();
		
		Rectangle rect = new Rectangle(base, height);
		System.out.println("Perimetro: " + rect.perimeter());
		System.out.println("Area: " + rect.area());
	}
	
	public static void createPolygon() {
		int sides;
		double side;
		System.out.println("Inserisci il numero di lati del poligono regolare:");
		sides = scanner.nextInt();
		System.out.println("Inserisci la lunghezza del lato:");
		side = scanner.nextDouble();
		RegularPolygon polygon = new RegularPolygon(sides, side);
		
		System.out.println("Perimetro: " + polygon.perimeter());
		System.out.println("Area: " + polygon.area());
	}

}
