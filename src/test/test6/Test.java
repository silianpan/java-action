package test6;

public class Test {
	public static void main(String args[]){
		
		Car car = new Car("大众","白色",5);
		Truck truck = new Truck("东风","红色",(float)2.0);
		car.showCar();
		System.out.println("**********************");
		truck.ShowTruck();
	}
}
