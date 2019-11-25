package demo.reflect;

public class User implements Comparable<Object>{
	
	private String name;
	private String password;
	
	public User(){
		System.out.println("无参构造函数");
	}
	
	public void login(){
		
		
		// 检查用户名和密码
		System.out.println("login successfully!");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
