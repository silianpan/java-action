package test.test1;

public class Test {
	
	public static void printStr(String str){
		
		for (int i = str.length() - 1; i >= 0; i--){
			char ch = str.charAt(i);
			System.out.print(ch + " ");
		}
		System.out.println();
		
	}
	public static void main(String args[]){
		String str = "abcdef";
		printStr(str);
	}
}
