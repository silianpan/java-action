package demo.enumDemo;

public class Test {

    public static void main(String[] args) {

        Color c = Color.RED;
        System.out.println(c);
        System.out.println(c.name());
        System.out.println(c.ordinal());        // 序号

        for (Color c1 : Color.values()) {        // 遍历，通过values获取所有的项
            System.out.println(c1.ordinal() + "--->" + c1.name() + "(" + c1.getName() + ")");
        }

    }

}
