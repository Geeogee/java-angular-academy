package garage;
import java.util.Scanner;

public class GarageTesting {

	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int action;
		boolean exit = false;
		int vehicleType;
		String brand;
		int year;
		double displacement;
		int doors;
		int strokes;
		String fuelType;
		int capability;
		
		Garage g = new Garage();
		System.out.println("Benvenuto!");
		do {
			
			g.garageManager();
			action = input.nextInt();
			switch(action) {
				case 1:
					Scanner vehicleChoice = new Scanner(System.in);
					Scanner vehicleInfos = new Scanner(System.in);
					System.out.println("Che tipo di veicolo vuoi aggiungere?");
					System.out.println("[Macchina = 1 | Moto = 2 | Furgone = 3]");
					
					vehicleType = vehicleChoice.nextInt();
					while(vehicleType < 1 || vehicleType > 3) {
						System.out.println("Inserisci un carattere valido!");
						vehicleType = vehicleChoice.nextInt();
					}
					
					System.out.println("Marca:");
					brand = vehicleInfos.nextLine();
					System.out.println("Anno:");
					year = vehicleInfos.nextInt();
					System.out.println("Cilindrata:");
					displacement = vehicleInfos.nextDouble();
					
					// Macchina
					if (vehicleType == 1) {
						Scanner carInfos = new Scanner(System.in);
						System.out.println("Porte:");
						doors = carInfos.nextInt();
						System.out.println("Alimentazione:");
						carInfos.nextLine();
						fuelType = carInfos.nextLine();
						// Creo l'oggetto macchina
						Car c = new Car(brand, year, displacement, doors, fuelType);

						if(g.addVehicle(c) == 0) {
							System.out.println(ANSI_GREEN + "Macchina parcheggiata.\n" + ANSI_RESET);
							System.out.println(c.toString());
						}		
					} 
					// Moto
					else if(vehicleType == 2) {
						Scanner motoInfos = new Scanner(System.in);
						System.out.println("Tempi:");
						strokes = motoInfos.nextInt();
						Motorcycle m = new Motorcycle(brand, year, displacement, strokes);
						
						if(g.addVehicle(m) == 0) {
							System.out.println(ANSI_GREEN + "Moto parcheggiata.\n" + ANSI_RESET);
							System.out.println(m.toString());
						}
						
					} 
					// Furgone
					else if(vehicleType == 3) {
						Scanner vanInfos = new Scanner(System.in);
						System.out.println("Capacità:");
						capability = vanInfos.nextInt();
						Van v = new Van(brand, year, displacement, capability);
						
						if(g.addVehicle(v) == 0) {
							System.out.println(ANSI_GREEN + "Van parcheggiato.\n" + ANSI_RESET);
							System.out.println(v);
						}
						
					}
					
					break;
					
				case 2:
					if (g.getPlaces().size() > 0) {
						Scanner removeChoice = new Scanner(System.in);
						System.out.println("Quale veicolo vuoi rimuovere?");
						int remove = removeChoice.nextInt();
						g.removeVehicle(remove-1);
					} else {
						System.out.println("Il garage è vuoto.");
					}
					break;
					
				case 3:
					g.showGarage();
					break;
				
				case 4:
					exit = true;
					System.out.println("Arrivederci!");
					break;
			}
			
		} while(!exit);
		
	}
	
}
