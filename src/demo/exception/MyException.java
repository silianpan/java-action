
// 自定义异常类
public class MyException extends Exception{
	
	// 构造方法，带一个错误信息的参数message
	public MyException(String message){
		// 使用super调用父类的构造函数，初始化错误信息message
		super(message);
	}
	
	// 重写printStackTrace
	public void printStackTrace(){
		System.out.println("my printStackTrace");
		
	}
	
	// 重写getMessage
	public String getMessage(){
		return "my getMessage";
	}


}
