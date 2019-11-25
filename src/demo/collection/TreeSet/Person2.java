package demo.collection.TreeSet;

public class Person2 implements Comparable<Object> {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    /**
     * 实现Comparable接口里面的方法
     */
    @Override
    public int compareTo(Object obj) {
        // 强制转换
        Person per = (Person) obj;

//		if ( this.age > per.getAge() ){
//			return -5;
//		}else if ( this.age == per.getAge() ){
//			return 0;
//		}else{
//			return 2;
//		}

//		this.name.equals(per.getName());

        return this.name.compareTo(per.getName());
    }

    public String toString() {
        return "姓名：" + this.name + "; 年龄：" + this.age;
    }
}
