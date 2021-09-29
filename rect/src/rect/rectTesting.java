package rect;
import java.util.Scanner;

public class rectTesting {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Definire la base");
		double base = input.nextDouble();
		
		System.out.println("Definire l'altezza");
		double altezza = input.nextDouble();
		
		Rect rettangolo = new Rect(base, altezza);
		
		double area = rettangolo.getArea();
		double perimetro = rettangolo.getPerimetro();
		
		System.out.println("L'area è: " + area);
		System.out.println("Il perimetro è: " + perimetro);
	}
}
