//Si realizzi una applicazione java per la gestione di un garage secondo le specifiche:
//il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire da 0 e per motivi di capienza può ospitare 
// solo auto moto e furgoni partendo dalla classe base veicolo a motore V;
// la si estenda, realizzando anche le classi che modellano le entità furgone (F) auto (A) e moto (M).
//Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte le informazioni che la riguardano.
//Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti operazioni di gestione
//1] immissione di un nuovo veicolo
//2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
//3] stampa della situazione corrente dei posti nel garage veicolo:
//marca,anno,cilindrata;
//auto:porte, alimentazione (diesel/benzina)
//moto:tempi
//furgone:capacità

package garage;
import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
	
	static final int MAX_CAPABILITY = 15;
	private int initalCapability = 0;
	ArrayList<Vehicle> places = new ArrayList<Vehicle>();
	Scanner input = new Scanner(System.in);
	
	public Garage() {
		
	}
	
	public ArrayList<Vehicle> getPlaces() {
		return places;
	}
	
	public void garageManager() {
		System.out.println("---------------------------------");
		System.out.println("1. Aggiungi un veicolo nel garage");
		System.out.println("2. Libera un posto");
		System.out.println("3. Verifica disponibilità garage");
		System.out.println("4. Esci");
		System.out.println("---------------------------------");
	}
	
	public int addVehicle(Vehicle vehicleToAdd) {
		if(places.size() < MAX_CAPABILITY) {
			places.add(vehicleToAdd);
			return 0;
		} else {
			System.out.println("Il garage è pieno, non è possibile aggiungere altri veicoli!");		
			return -1;
		}
	}
	
	public void removeVehicle(int place) {
		boolean exists = ! (place >= places.size());
		if (exists) {
			System.out.println("Sei sicuro di voler rimuovere questo veicolo? (s/n)");
			System.out.println(places.get(place));
			String reply = input.next();
			if(reply.equals("s")) {
				String brand = places.get(place).getBrand();
				places.remove(place);
				System.out.println("Hai rimosso con successo il veicolo " + brand + "\n");
			} else {
				System.out.println("Rimozione annullata!");
			}
		} else {
			System.out.println("Il veicolo indicato non è presente nel nostro garage!");
		}
	}
	
	public void showGarage() {
		System.out.println("Ecco il garage al momento:");
		if(places.size() == 0) {
			System.out.println("Il garage è al momento vuoto!\n");
		} else {
			
//			for(Vehicle v : places) {
//				System.out.println(v.getBrand() + "\n");
//			}
			
			for(int i=0; i<places.size(); i++) {
				System.out.println(i + 1 + ") " + places.get(i).getBrand() + "\n");
			}
		}
	}
}
