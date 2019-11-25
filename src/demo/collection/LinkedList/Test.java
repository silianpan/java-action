package demo.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String args[]){
		
		// LinkedList 特点
		// 1. 有序
		// 2. 可以重复
		
		// 创建一个LinkedList对象
//		List<String> strLinked = new LinkedList<String>();
		LinkedList<String> strList = new LinkedList<String>();
		LinkedList<Person> perList = new LinkedList<Person>();
		
		// 添加元素
		strList.add("A");
		// 添加链表头元素
		strList.addFirst("B");
		// 添加链表尾元素
		strList.addLast("C");
		
		perList.add(new Person("张三",21));
		perList.add(new Person("李四",20));
		perList.add(new Person("王五",19));
		
		// 删除元素
		strList.removeFirst();	// 删除链表头元素
		
		// 获取元素
		System.out.println("链表头元素：" + strList.getFirst()); 	// 获取链表头元素
		System.out.println("链表尾元素：" + strList.getLast());		// 获取链表尾元素
		
		// peek, 获取链表头元素，不删除
		System.out.println("获取链表头元素，不删除：" + strList.peek());
		
		// poll, 获取链表头元素，并删除
		System.out.println("获取链表头元素，并删除：" + strList.poll());
		
		// element，获取链表头元素
		System.out.println("获取链表头元素：" + strList.element());
		
		// 直接打印
		System.out.println("直接打印：" + strList);
		System.out.println("直接打印：" + perList);
		// 遍历，第一种遍历方法
		System.out.print("第一种遍历方法：");
		for (int i = 0; i < strList.size(); i++){
			System.out.print(strList.get(i) + "、");
		}
		System.out.println();
		
		// 第二种比遍历方法
		System.out.print("第二种遍历方法：");
		for ( String str : strList){
			System.out.print(str + "、");
		}
		System.out.println();
		
		// 第三种遍历方法
		System.out.print("第三种遍历方法：");
		Iterator<String> iter = strList.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + "、");
		}
		System.out.println();
	
	} 

}
