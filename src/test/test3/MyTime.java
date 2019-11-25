package test.test3;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int hour, int minute, int second){
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	
	public void setHour(int hour){
		this.hour = hour;
	}
	
	public void setMinute(int minute){
		this.minute = minute;
	}
	
	public void setSecond(int second){
		this.second = second;
	}
	
	public int getHour(){
		return this.hour;
	}
	public int getMinute(){
		return this.minute;
	}
	public int getSecond(){
		return this.second;
	}
	
	public void display(){
		System.out.println(this.getHour() + ":" + 
				this.getMinute() + ":" + this.getSecond());
	}
}
