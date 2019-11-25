package demo.collection.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 1. HashMap　特点
 * （１）添加重复key元素，会发生覆盖，所以是无重复key元素的
 */

public class Test {

    public static void main(String[] args) {

        // 创建一个HashMap对象
        Map<Integer, String> strMap = new HashMap<Integer, String>();

        // 添加元素
        Integer ite = 1;            // 隐式转换
        Integer ite1 = new Integer(1);

        strMap.put(2, "李四");
        strMap.put(1, "张三");

        strMap.put(3, "王五");
        strMap.put(3, "老王");            // 添加重复key元素，会发生覆盖

        strMap.put(5, "孙七");
        strMap.put(4, "赵六");


        // 删除元素
//		strMap.remove(1);

        // 其他方法
        System.out.println("清空map：");
//		strMap.clear(); 					// 清空
        System.out.println("是否包含key值为1？" + strMap.containsKey(1));                // 是否包含某个key
        System.out.println("是否包含value值为张三？" + strMap.containsValue("张三"));        // 是否包含某个value

        // 直接打印
        System.out.println("直接打印：" + strMap);

        // 遍历
        System.out.println("第一种遍历方法：");
        // 1. 第一种遍历方法
        // (1) 获取一个key集合
        Set<Integer> keyset = strMap.keySet();
        // (2) 遍历key集合
        for (Integer key : keyset) {
            // (3) 获取key
            String value = strMap.get(key);
            // (4) 打印
            System.out.println(key + "——————》" + value);
        }
        System.out.println();

        System.out.println("第二种遍历方法：");
        // 2. 第二种遍历方法
        // (1) 获取集合strMap的实体集合
        Set<Map.Entry<Integer, String>> entryset = strMap.entrySet();
        // (2) 遍历实体集合
        for (Map.Entry<Integer, String> entry : entryset) {
            // （3）获取key
            Integer key = entry.getKey();
            // （4）获取value
            String value = entry.getValue();
            // （5） 打印
            System.out.println(key + "——————》" + value);
        }
        System.out.println();

        // 获取所有的value集合
        System.out.println("获取value集合：");
        // （1）获取value集合，调用values方法
        Collection<String> values = strMap.values();
        // （2）遍历
        for (String value : values) {
            // (3) 打印
            System.out.println("值————》" + value);
        }

    }

}
