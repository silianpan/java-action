package demo.collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

    public static void main(String args[]) {

        // 创建一个HashSet对象
        Set<String> strSet = new HashSet<String>();
        Set<String> strSet1 = new HashSet<String>();
        strSet1.add("A");
        strSet1.add("E");
        strSet1.add("F");

        // 添加元素
        strSet.add("A");
        strSet.add("B");
        strSet.add("C");
        strSet.add("C");
        strSet.addAll(strSet1);

        // 删除元素
//		strSet.remove("C");
//		strSet.removeAll(strSet1);

        // 其他方法
        strSet.isEmpty();
        strSet.contains("D");

        // 直接打印
        System.out.println("直接打印：" + strSet);

        // 遍历
        // 第一种比遍历方法foreach
        System.out.println("第一种遍历方法：");
        for (String str : strSet) {
            System.out.print(str + "、");
        }
        System.out.println();

        // 第二种遍历方法iterator
        System.out.println("第二种遍历方法：");
        Iterator<String> iter = strSet.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + "、");
        }
        System.out.println();

    }
}
