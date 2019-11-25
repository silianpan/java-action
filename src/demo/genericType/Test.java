package demo.genericType;

public class Test {

	public static void main(String[] args) {
		
		Point<Float> p = new Point<Float>(1.1f,2.2f);
		System.out.println(p);
		
		Point<Integer> p1 = new Point<Integer>(1,2);
		System.out.println(p1);
	
	}

}
