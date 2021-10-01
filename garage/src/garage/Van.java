package garage;

public class Van extends Vehicle {
	
	private int capability;
	
	public Van(String _brand, int _year, double _displacement, int _capability) {
		super(_brand, _year, _displacement);
		this.capability = _capability;
	}
	
	public int getCapability() {
		return this.capability;
	}
	
	@Override
	public String toString() {
		super.toString();
		vehicleInfos += "Capacità: " + this.capability + "\n";
		
		return vehicleInfos;
	}
}