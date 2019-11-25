package demo.thread;

/**
 * 多线程实现方式
 * 1. 继承Thread类,实现run方法
 * 2. 实现Runnable接口
 *
 *
 */
public class Ticket extends Thread{
	
	private int count = 10;
	
	// 实现run方法
	public void run(){
		while(true){
			if (this.count > 0){
				System.out.println("count: " + this.count--);
			}
		}
	}

}
