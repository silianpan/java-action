package test.test2;

public class Vehicle {
	private int speed;
	private int size;
	
	public Vehicle(int speed, int size){
		this.setSpeed(speed);
		this.setSize(size);
	}
	
	public void move(){
		System.out.println("vehicle move");
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void speedUp(){
		this.speed++;
	}
	
	public void speedDown(){
		this.speed--;
	}
	
	public void speedUp(int speed){
		this.speed += speed;
	}
	
	public void speedDown(int speed){
		this.speed -= speed;
	}
	
	public String toString(){
		return "速度：" + this.getSpeed() + 
				"\n体积：" + this.getSize();
	}
	
}
