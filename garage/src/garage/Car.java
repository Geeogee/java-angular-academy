package garage;

public class Car extends Vehicle {
	
	private int doors;
	private String fuelType;
	
	public Car(String _brand, int _year, double _displacement, int _doors, String _fuelType) {
		super(_brand, _year, _displacement);
		this.doors = _doors;
		this.fuelType = _fuelType;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public String getFuelType() {
		return this.fuelType;
	}
	
	public String toString() {
		super.toString();
		vehicleInfos += "Porte: " + this.doors + "\n";
		vehicleInfos += "Alimentazione: " + this.fuelType + "\n";
		
		return vehicleInfos;
	}
}
