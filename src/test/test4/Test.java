package test.test4;

public class Test {
	public static void main(String args[]){
		
		int a = 1;
		int b = 0;
		Number number = new Number(a,b);
		System.out.println(a + "+" + b + "=" + number.addition());
		System.out.println(a + "-" + b + "=" + number.subtration());
		System.out.println(a + "*" + b + "=" + number.multiplication());
		System.out.println(a + "/" + b + "=" + number.division());
	}
}
