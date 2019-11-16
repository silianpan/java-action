package simpleClock.control;

import simpleClock.view.MyTimeFrame;

public class MyTimeThread implements Runnable {
    private MyTimeFrame mytime;

    public MyTimeThread(MyTimeFrame mytime) {
        this.mytime = mytime;
    }

    public void run() {
        while (true) {
			/**
			 * 此时会调用visible是ture的图形组件的repaint()方法对界面重绘。
			 */
			mytime.repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
