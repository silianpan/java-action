package test2;

public class Test {
	public static void main(String args[]){
		
		Vehicle vehicle = new Vehicle(60, 1000);
		vehicle.move();
		System.out.println("启动：\n" + vehicle);
		vehicle.speedUp();
		System.out.println("加速1: \n" + vehicle);
		vehicle.speedDown();
		System.out.println("减速1: \n" + vehicle);
		vehicle.speedUp(20);
		System.out.println("加速20: \n" + vehicle);
		vehicle.speedDown(10);
		
		System.out.println("减速10: \n" + vehicle);
	}
}
