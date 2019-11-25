import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 1. TreeMap 特点
 * 	（1） 会按照某种规则排序，和TreeSet完全相同
 * 		a. 如果是数字，按数字大小排序
 * 		b. 如果是字母，按字母顺序排序
 * 		c. 如果是自定义对象， 要制定一个排序规则，即，实现Comparable接口，实现compareTo方法
 *
 */


public class Test {

	public static void main(String[] args) {
		
		// 创建一个TreeMap对象
		Map<Integer, String> strMap = new TreeMap<Integer, String>();
		
		// 添加元素，和HashMap完全相同
		strMap.put(1, "张三");
		strMap.put(2, "李四");
		strMap.put(3, "王五");
		strMap.put(4, "赵六");
		
		// 直接打印
		System.out.println("直接打印：" + strMap);
		
		// 遍历，和HashMap完全相同
		// 第一种遍历方法
		Set<Integer> keyset = strMap.keySet();
		for ( Integer key : keyset ){
			String value = strMap.get(key);
		}
		
		// 第二种遍历方法
		Set< Map.Entry<Integer, String> > entryset = strMap.entrySet();
		for ( Map.Entry<Integer, String> entry : entryset ){
			entry.getKey();
			entry.getValue();
		}
		
		// 创建一个自定义类元素Map
		Map<Person, String> perMap = new TreeMap<Person, String>();
		
		// 添加元素，把Person对象作为key
		perMap.put(new Person("张三", 19), "张三");
		perMap.put(new Person("李四", 21), "李四");
		perMap.put(new Person("王五", 23), "王五");
		perMap.put(new Person("赵六", 20), "赵六");
		
		// 直接打印
		System.out.println("直接打印： " + perMap);
		
		// 遍历
		Set<Person> keyset1 = perMap.keySet();
		for ( Person key : keyset1 ){
			String value = perMap.get(key);
			System.out.println(key + "  ——————》  " + value);
		}

	}

}
