package demo.collection.TreeMap;

public class Person implements Comparable<Object>{
	private String name;
	private int age;
	
	public Person(String name, int age ){
		this.name = name;
		this.age = age;
	}
	
	public String toString () {
		return "姓名: " + this.name + "; 年龄：" + this.age;
	}

	@Override
	public int compareTo(Object o) {
		Person per = (Person) o;
		
		if ( this.age > per.age ){
			return 1;
		}else if ( this.age == per.age ){
			return 0;
		}else{
			return -1;
		}
	}
}
