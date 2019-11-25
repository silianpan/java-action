
/**
 * 1 多线程实现方式
 * （1）. 继承Thread类,实现run方法
 * （2）. 实现Runnable接口, 实现run方法
 * 
 * 在编程实践中，一般使用Runnable方法
 * 
 * 2. 线程同步加锁，即对共享资源进行加锁
 * （1）在代码块中加锁
 * （2）在方法中加锁
 *
 *
 */
public class Ticket2 implements Runnable{
	
	private int count = 10;
	
	
	public synchronized void getCount(){
		// Thread.currentThread().getName() 获取当前线程的名称
		System.out.println(Thread.currentThread().getName() + "count: " + this.count--);
	}
	
	// 实现run方法
	public void run(){
		while(true){
			if (this.count > 0){
				// 线程休眠
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				getCount();
			}
		}
	}
	
	// 实现run方法
	/*public void run(){
		while(true){
			if (this.count > 0){
				// 线程休眠
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				// 在代码块中加锁
				synchronized (this) {
					// Thread.currentThread().getName() 获取当前线程的名称
					System.out.println(Thread.currentThread().getName() + "count: " + this.count--);
				}
			}
		}
	}*/

}
