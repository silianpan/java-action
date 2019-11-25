
// 创建一个枚举Color
public enum Color {

	RED("红色"), GREEN("绿色"), BLUE("蓝色");
	
	private String name;
	private Color(String name){
		this.name = name;
	}
	
	String getName(){
		return this.name;
	}
}
