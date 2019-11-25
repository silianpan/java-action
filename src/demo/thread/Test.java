package demo.thread;

public class Test {
	
	public static void main(String args[]){
		
		// 1. Thread方法
		// 创建Ticket对象
		/*
		Ticket t = new Ticket();
		Ticket t2 = new Ticket();
		
		// 普通调用方法
//		t.run();
		
		// 线程调用方法
		t.start();
		t2.start();*/
		
		// 2. Runnable方法
		
		// 创建Ticket对象
		Ticket2 t1 = new Ticket2();
		
		// 创建Thread对象
		Thread th1 = new Thread(t1, "线程1");
		Thread th2 = new Thread(t1, "线程2");
		
		// 启动线程
		th1.start();
		th2.start();
		
//		// 线程中断
//		th1.interrupt();
//		// 线程抢占
//		th1.join();
//		// 线程礼让
//		th1.yield();
//		// 线程销毁
//		th1.destroy();
		
	}

}
