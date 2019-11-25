package demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class Test {

	public static void main(String[] args) {
		
		// 反射，使用Class类
		// 这里的？代表任意类型
		try {
			
			// 通过名称，获取类
			Class<?> c = Class.forName("User");
			
			// 获取构造函数数组,包是java.lang.reflect
			Constructor<?>[] cons = c.getConstructors();
			
			// 默认无参构造函数,实例化一个对象，相当于new
			cons[0].newInstance();
			
			// 获取方法数组，即所有方法
			c.getMethods();
			
			// 获取login方法
			Method login = c.getMethod("login");
			System.out.println(login);
			
			// 调用login方法
			login.invoke(c.newInstance());
			
			// 获取类中的属性
//			c.getField("password"); 	//获取某一个属性
			c.getFields();				// 获取所有属性
			
			// 获取父类
			c.getSuperclass();
			
			// 获取接口
			c.getInterfaces();
			
			// 这是我们以前的做法
			User u = new User();
			u.login();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
