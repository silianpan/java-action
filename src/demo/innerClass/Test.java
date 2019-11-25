package demo.innerClass;

public class Test {
	public static void main(String args[]){
		// 创建外部类对象
		OuterClass oc = new OuterClass();
		// 调用外部类成员方法
		oc.outerMethod();
		
		// 调用外部类成员方法，返回内部类对象
		OuterClass.InnerClass outinobj = oc.makeInnerObject();
		
		// 直接new一个内部类对象
		OuterClass.InnerClass innerObj = new OuterClass.InnerClass();
		innerObj.innerMethod();
		
		// 调用含有局部内部类的方法
		oc.OuterMethod2();
	}
}
