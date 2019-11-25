package demo.thread;

/**
 * 多线程实现方式
 * 1. 继承Thread类,实现run方法
 * 2. 实现Runnable接口
 *
 * Thread局限：
 * （1）单继承局限
 * （2）new Mythread().start(); //启动 n 个线程
 * new Mythread().start();
 * 这种实现方式实际上是重写了 run() 方法，由于线程的资源和 Thread 实例捆绑在一起，
 * 所以不同的线程的资源不会进行共享。
 */
public class Ticket extends Thread {

    private int count = 10;

    // 实现run方法
    public void run() {
        while (true) {
            if (this.count > 0) {
                System.out.println("count: " + this.count--);
            }
        }
    }

}
