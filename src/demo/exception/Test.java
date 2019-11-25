package demo.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test {
	
	// 除法运算
	public static float division(int a, int b) throws ArithmeticException, FileNotFoundException, MyException{
//		if( b == 0 ) {
//			throw new FileNotFoundException();
//		}
		
		if ( b == 0){
			throw new MyException("除数不能为0啊！");
		}
		
		return a/b;
	}
	
	// 读文件
	public static void readFile(String filePath) throws IOException{
		
		FileInputStream fin = new FileInputStream(filePath);
		fin.read();
		fin.close();
	}
	
	public static void main(String args[]){
		
//		String filePath = "c:\\windows\\test.txt";
//		
//		try {
//			readFile(filePath);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//			System.out.println(e1.getMessage());
//		}
		
		int a = 1;
		int b = 0;
		
		try{
			division(a, b);
		}catch( MyException e ){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			// 解决异常的方法
			System.out.println("系统自带的ArithmeticException： 除数不能为0");
		}catch(FileNotFoundException e){
			System.out.println("文件不存在");
		}
		
		
//		try{
//			System.out.println(1/1);
//		}catch(ArithmeticException e){
//			System.out.println("除数不能为0");
//		}catch(Exception e){
//			// to do...
//		}finally{
//			System.out.println("不管有没有异常，都会执行");
//		}
	}

}
