package demo.collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String args[]) {

        // HashSet特点
        // 1、 无序
        // 2、 不重复

        // 创建一个HashSet对象
        Set<String> strSet = new HashSet<String>();

        Set<String> strSet2 = new HashSet<String>();
        strSet2.add("F");
        strSet2.add("G");
        strSet2.add("H");

        // 添加元素
        strSet.add("D");
        strSet.add("E");
        strSet.add("E");
        strSet.add("A");
        strSet.add("B");
        strSet.add("C");
        strSet.addAll(strSet2);


        // 直接打印
        System.out.println("直接打印：" + strSet);
    }

}
