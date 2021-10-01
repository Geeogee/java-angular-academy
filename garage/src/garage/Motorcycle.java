package garage;

public class Motorcycle extends Vehicle {
	
	private int strokes;
	
	public Motorcycle(String _brand, int _year, double _displacement, int _strokes) {
		super(_brand, _year, _displacement);
		this.strokes = _strokes;
	}
	
	public int getStrokes() {
		return this.strokes;
	}
	
	@Override
	public String toString() {
		super.toString();
		vehicleInfos += "Tempi: " + this.strokes + "\n";
		
		return vehicleInfos;
	}
}