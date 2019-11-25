import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 特点
 * 1. 自动排序，而非插入顺序
 * 2. 无重复
 *
 */
public class Test {

	public static void main(String[] args) {
		
		// 创建一个TreeSet对象
		Set<String> strSet = new TreeSet<String>();
		Set<String> strSet2 = new TreeSet<String>();
		strSet2.add("A");
		strSet2.add("G");
		strSet2.add("F");
		
		// 添加元素
		strSet.add("A");
		strSet.add("B");
		strSet.add("E");
		strSet.add("D");
		strSet.add("C");
		strSet.addAll(strSet2);		// 插入一个集合
		
		// 删除元素
//		strSet.remove("E");
//		strSet.removeAll(strSet2);
		
		// 直接打印
		System.out.println("直接打印：" + strSet);
		
		// 遍历，和HashSet相同
		
		
		Set<Person> perSet = new TreeSet<Person>();
		perSet.add(new Person("张三", 21));
		perSet.add(new Person("李四", 20));
		perSet.add(new Person("王五", 19));
		perSet.add(new Person("赵六", 23));
		perSet.add(new Person("赵六", 24));
		
		// 直接打印
//		System.out.println("直接打印；" + perSet);
		
		// 遍历
		for (Person per: perSet){
			System.out.println(per);
		}
		
		// hashCode
		String name1 = "张三";
		String name2 = "李四";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		String a = "a";
		String b = "B";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}

}
