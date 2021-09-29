//Progettare e realizzare una classe Car(automobile) con le proprietà seguenti.
//Un’automobile ha una determinata resa del carburante (misurata in miglia/galloni
//o in litri/chilometri: scegliete il sistema che preferite) e una certa quantità
//di carburante nel serbatoio. La resa è specificata dal costruttore e il livello
//iniziale del carburante è a zero. Fornire questi metodi: un metodo drive per
//simulare il percorso di un’automobile per una certa distanza, riducendo il
//livello di carburante nel serbatoio; un metodo getGas, per ispezionare il
//livello corrente del carburante; un metodo addGas per far rifornimento.


package car;
import java.util.Random;

public class Car {
	
	private double fuel = 0;
	private String name;
	private double kmLiter;
	private static final double FUEL_PRICE = 1.819;
	private static final int FUEL_MAX = 60;
	
	public Car(double energyEfficiency, String carName) {
		this.kmLiter = energyEfficiency;
		this.name = carName;
	}
	
	public String getName() {
		return name;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public double addGas(int euro) {
		double loadedFuel = euro / FUEL_PRICE;
		if (loadedFuel > FUEL_MAX) {
			loadedFuel = FUEL_MAX;
			System.out.println("Hai fatto il pieno!");
		}
		
		fuel = loadedFuel;
		return loadedFuel;
	}
	
	public void drive(int km) {
		double carConsum = km * kmLiter;
		if (carConsum >= FUEL_MAX ||  fuel - carConsum <= 0) {
			System.out.println("Hai finito la benzina!");
			fuel = 0;
		} else {
			fuel -= carConsum;
			System.out.println("Hai percorso " + km + "km, consumando " + carConsum + " litri di benzina!");
			System.out.println("Ti rimangono " + CarTesting.round(fuel) + "l di benzina.");
		}
	}
}
