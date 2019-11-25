package demo.collection.TreeSet;

public class Person implements Comparable {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "姓名：" + this.name + "；年龄：" + this.age;
    }

    // 实现Comparable里面的CompareTo方法
    @Override
    public int compareTo(Object obj) {
        Person per = (Person) obj;
//		if ( this.age > per.getAge() ){
//			return 1;
//		}else if ( this.age == per.getAge() ){
//			return 0;
//		}else{
//			return this.name.compareTo(per.getName());
//		}
        return this.name.compareTo(per.getName());
    }


}
