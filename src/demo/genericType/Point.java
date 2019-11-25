package demo.genericType;

public class Point<T> {
	
	private T x;
	private T y;
	
	public Point(T x, T y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "X = " + this.x  + "\nY = " + this.y;
	}

}
