import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String args[]){
		
		// 创建一个List对象
		List<String> strList = new ArrayList<String>();
		List<Integer> strList1 = new ArrayList<Integer>();
		
		// 添加元素
		strList.add("A");
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add(0, "E");    // 在某一个下标处添加
//		strList.addAll(c);		// 添加一个集合
		
		// 删除元素
		strList.remove(0);
		strList.remove("B");
//		strList.removeAll(c);	// 删除某一个集合
		// 1206284818
		
		// 直接打印
		System.out.println(strList);
		
		// 1. 第一种遍历方法
		System.out.println("第一种遍历方法；");
		for ( int i = 0; i < strList.size(); i++){
			System.out.print(strList.get(i) + "、");
		}
		System.out.println();
		
		// 2. 第二种遍历方法，foreach
		System.out.println("第二种遍历方法；");
		for ( String str: strList){
			System.out.print(str + "、");
		}
		System.out.println();
		
		// 3. 第三种遍历方法，iterator
		// 所有的集合类（实现Collector接口的类），都实现了Iterator接口
		// 获取List的iterator接口
		System.out.println("第三种遍历方法；");
		Iterator<String> iter = strList.iterator();
		// 判断iter的下一个元素是否存在
		while( iter.hasNext() ) {
			String str = iter.next();
			System.out.print(str + "、");
		}
		
		// 其他方法
		// 1. isEmpty判断是否为空
		System.out.println("集合strList是否为空？ " + strList.isEmpty());
		// 2. indexof 获取某一个元素的下标
		System.out.println("集合元素E的下标： " + strList.indexOf("E"));
		// 3. 集合截取，取得一个子集合
		System.out.println("获取子集合： " + strList.subList(2, 3));
		// 4. 判断元素是否存在
		System.out.println("判断集合元素A是否存在？" + strList.contains("A"));
		
	}

}
