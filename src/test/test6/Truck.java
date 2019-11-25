package test6;

public class Truck extends Vehicles {
	
	private float load;

	public Truck(String brand, String color, float load) {
		super(brand, color);
		this.load = load;
	}
	
	public void ShowTruck(){
		super.showInfo();
		System.out.println("дижиЃК" + this.load);
	}
	
}
