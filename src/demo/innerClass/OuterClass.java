package demo.innerClass;

public class OuterClass {

    // 外部类成员属性
    private static double oa;

    // 外部类成员方法
    public static void outerMethod() {
        System.out.println("外部类 outerMethod");
    }

    // 创建内部类对象，并返回
    public InnerClass makeInnerObject() {
        InnerClass ic = new InnerClass();
        ic.innerMethod();
        return ic;
    }

    // 定义内部类，或者静态内部类
    static class InnerClass {
        // 内部类成员属性
        private double ia;

        // 内部类成员方法
        public void innerMethod() {
            System.out.println(oa);
            System.out.println("内部类 innerMethod");
            outerMethod();
        }
    }

    // 含有局部内部类的方法
    public void OuterMethod2() {

        final int i = 1;

        class InnerClass2 {
            private double ia2;

            public void innerMethod2() {
                System.out.println(i);
                System.out.println(oa);
                System.out.println("局部内部类 innerMethod2");
                outerMethod();
            }
        }
        // 创建局部内部类对象
        InnerClass2 ic2 = new InnerClass2();
        ic2.innerMethod2();
    }

    // 定义匿名内部类
    public Object outerMethod3() {
        return new Object() {
            private double ia3;

            public void innerMethod3() {
                System.out.println("匿名内部类 innermethod3");
            }
        };
    }


}
