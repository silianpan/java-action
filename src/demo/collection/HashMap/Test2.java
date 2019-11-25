package demo.collection.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * 知识点
 * 1. 泛型
 * 	（1）不能使用8种基本数据类型，使用它们的包装类，如Integer，Float, Double, Boolean, Character, Byte等
 * 
 * 2. 向上转型
 * 	Map<Integer,String> strMap = new HashMap<Integer, String>();
 * 
 * 3. Map 特点
 * 	（1）无重复数据
 * 	（2）后面重复的内容，会覆盖前面相同key的数据
 *
 */
public class Test2 {

	public static void main(String[] args) {
		
		// 创建一个HashMap的对象
		Map<Integer, String> strMap = new HashMap<Integer, String>();
		Map<Integer, String> strMap2 = new HashMap<Integer, String>();
		strMap2.put(4, "赵六");
		strMap2.put(5, "孙七");
		
		// 添加元素
		Integer inte = 1;			// 隐式转换
		strMap.put(inte, "张三");
		strMap.put(2, "李四");
		strMap.put(3, "王五");
		strMap.put(3, "王麻子");		// 覆盖前面的相同Key的数据
		strMap.putAll(strMap2);		// 添加另外一个Map结构
		
		// 删除
		strMap.remove(1);			// 删除key等于1的实体，包括key和value一起删除
//		strMap.clear();				// map清空
		
		// 其他方法
		// 1. isEmpty, 判断map是否为空
		System.out.println("判断集合strMap是否为空？" + strMap.isEmpty());
		
		// 2. containsKey,是否包含某个key
		System.out.println("是否包含key为2的元素？" + strMap.containsKey(2));
		
		// 3. containsValue,是否包含某个value
		System.out.println("是否包含value为王麻子的元素？" + strMap.containsValue("王麻子"));
		
		// 4. size, map的大小
		System.out.println("strMap的大小" + strMap.size());
		
		
		// 直接打印
		System.out.println("直接打印：" + strMap);
		
		// 遍历
		// 1. 第一种遍历方法
		System.out.println("第一种遍历方法：");
		Set<Integer> keyset = strMap.keySet();		// 获取所有的key，返回一个集合对象
		// foreach
		for( Integer key : keyset ){
			String value = strMap.get(key);				// 获取对应key的value
			System.out.println(key + "——>" + value);	// 打印输出key和value
		}
		System.out.println();
		
		// 2. 第二种遍历方法，采用实体集合来遍历，entrySet方法，返回一个实体集合
		System.out.println("第二种遍历方法：");
		Set< Map.Entry<Integer, String> > entryset = strMap.entrySet();		// 获取一个实体集合
		// foreach
		for( Map.Entry<Integer, String> entry : entryset ){
			// 获取key
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "——》" + value);
		}
		System.out.println();
		
		// 获取一个key 集合，采用 keySet()
		
		// 获取一个value 集合，采用 values();
		Collection<String> valueColl = strMap.values();
		for ( String str : valueColl ){
			System.out.println("value = " + str);
		}
		
	}

}
