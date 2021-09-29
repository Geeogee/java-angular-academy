
package car;
import java.util.Scanner;

public class CarTesting {
	
	public static double round(double value) {
		
		double rounded = Math.floor(value * 100.0 / 100.0);
		return rounded;
	}
	
	public static void main(String args[]) {
		
		Scanner input;
		System.out.println("Inserisci il consumo dell'auto: (l/km)");
		input = new Scanner(System.in);
		double efficiency = input.nextDouble();
		
		System.out.println("Inserisci il nome dell'auto:");
		input = new Scanner(System.in);
		String carName = input.nextLine();
		
		Car myCar = new Car(efficiency, carName);
		System.out.println(myCar.getName() + " | Carburante: " + myCar.getFuel() + "l");
		System.out.println("Inserisci una banconota:");
		input = new Scanner(System.in);
		int euro = input.nextInt();
		System.out.println("Hai caricato " + round(myCar.addGas(euro)) + "l di carburante.");
		System.out.println("Carburante residuo: " + round(myCar.getFuel()) / 100 + "l");
		
		System.out.println("1. Guida");
		System.out.println("2. Parcheggia");
		boolean parking = false;
		do {
			System.out.println("Cosa vuoi fare?");
			input = new Scanner(System.in);
			int value = input.nextInt();
			switch(value) {
				case 1:
					System.out.println("Quanti km vuoi percorrere?");
					input = new Scanner(System.in);
					int km = input.nextInt();
					myCar.drive(km);
					if (myCar.getFuel() == 0) {
						System.out.println("Vuoi fare rifornimento? (s/n)");
						input = new Scanner(System.in);
						String action = input.nextLine();
						if(action.equals("s")) {
							System.out.println("Inserisci una banconota:");
							input = new Scanner(System.in);
							euro = input.nextInt();
							System.out.println("Hai caricato " + round(myCar.addGas(euro)) + "l di carburante.");
							System.out.println("Carburante residuo: " + round(myCar.getFuel()) + "l");
						} else {
							System.out.println("La macchina si è fermata.");
							parking = !parking;
						}
					}
					break;
				
				case 2:
					parking = !parking;
					System.out.println("Hai parcheggiato!");
					break;
			}
				
		} while(!parking);
		
	}
}
