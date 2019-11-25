package demo.collection.TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * 1. TreeSet 特点
 * 	（1）无重复
 * 	（2）有序，指会按照某种规则排序
 * 		a. 如果是字母，会按照字母顺序排序，即按照字符ASCII码排序 == hashCode
 * 		b. 如果是自定义类，那么要实现Comparable接口，实现compareTo方法
 */

public class Test2 {
	
	public static void main(String args[]){
		
		// 创建一个TreeSet对象
		Set<String> strSet = new TreeSet<String>();
		Set<String> strSet1 = new TreeSet<String>();
		strSet1.add("F");
		strSet1.add("E");
		strSet1.add("G");
		strSet1.add("D");
		
		// 添加元素
		strSet.add("A");
		strSet.add("C");
		strSet.add("C");
		strSet.add("B");
		strSet.addAll(strSet1);			// 添加一个集合
		
		// 删除元素
//		strSet.remove("E");
//		strSet.removeAll(c);
		
		// 直接打印
		System.out.println("直接打印：" + strSet);
		
		// 遍历方法，和HashSet完全相同
		
		// 创建一个自定义类集合
		Set<Person> perSet = new TreeSet<Person>();
		// 添加元素，即对象
		perSet.add(new Person("zhangsan", 21));
		perSet.add(new Person("lisi", 19));
		perSet.add(new Person("wangwu", 23));
		perSet.add(new Person("zhaoliu", 18));
		perSet.add(new Person("sunqi", 23));
		
		// 直接打印
		System.out.println("直接打印：" + perSet);
		
		// 遍历
		for ( Person per : perSet ){
			System.out.println(per);
		}
		
		String a = "A";
		String b = "B";
		String c = "C";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		
	
	}

}
