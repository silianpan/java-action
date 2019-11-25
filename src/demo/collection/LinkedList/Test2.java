package demo.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test2 {
	
	public static void main(String args[]){
		
		// 创建一个LinkedList对象
		LinkedList<String> strList = new LinkedList<String>();
		List<String> strList1 = new LinkedList<String>();
		strList1.add("E");
		strList1.add("F");
		strList1.add("G");
		
		// 添加元素
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add(0, "D"); 		// 在下标0位置插入D
		strList.addAll(strList1);	// 添加一个集合
		
		// 删除元素
//		strList.remove();			// 删除首元素
//		strList.removeFirst();		// 删除首元素
//		strList.remove(1);			// 删除下标为1的元素
//		strList.removeLast();		// 删除尾元素
//		strList.removeAll(strList1);	// 删除某一个集合元素
		
		// 获取首元素
		System.out.println(strList.element());
		System.out.println(strList.getFirst());
		// 获取首元素，并不删除
		System.out.println("获取首元素，并不删除" + strList.peek());
		// 获取首元素，并删除
		System.out.println("获取首元素，并删除：" + strList.poll());
		
		// 获取尾元素
		strList.getLast();
		strList.peekLast();
		strList.pollLast();
		
		// 其他方法
		strList.isEmpty();
		strList.contains("D");
		strList.indexOf("E");
		strList.subList(2, 3);
		
		// 直接打印
		System.out.println("直接打印：" + strList);
		
		// 遍历
		// 1. 第一种遍历方法
		System.out.println("第一种遍历：");
		for ( int i = 0; i < strList.size(); i++ ){
			System.out.print(strList.get(i) + "、");
		}
		System.out.println();
		
		// 2. 第二种遍历
		System.out.println("第二种遍历：");
		for ( String str : strList){
			System.out.print(str + "、");
		}
		System.out.println();
		
		// 3. 第三种遍历方法
		System.out.println("第三种遍历：");
		Iterator<String> iter = strList.iterator();
		while( iter.hasNext() ){
			System.out.print(iter.next() + "、");
		}
		System.out.println();
		
		// 双向遍历
		System.out.println("双向遍历");
		ListIterator<String> iter2 = strList.listIterator();
		while(iter2.hasNext()){
			
		}
		while(iter2.hasPrevious()){
			System.out.println(iter2.previous());
		}
		System.out.println();
		
	}

}
