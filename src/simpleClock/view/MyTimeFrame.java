package simpleClock.view;

import simpleClock.control.MyTimeThread;
import simpleClock.control.Screen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;

import javax.swing.JFrame;

public class MyTimeFrame extends JFrame {
    public MyTimeFrame() {

        this.setTitle("简易时钟");
        this.setSize(240, 110);

        this.setFont(new Font("黑体", Font.BOLD, 45));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new Thread(new MyTimeThread(this)).start();


        int x = (int) (Screen.getScreenSize().getWidth() / 2 - this.getWidth() / 2);
        int y = (int) (Screen.getScreenSize().getHeight() / 2 - this.getHeight() / 2);
        this.setLocation(x, y);
    }

    @Override
    public void paint(Graphics g) {
        Date now = new Date();
        int hours = now.getHours();
        int minute = now.getHours();
        int second = now.getSeconds();
        String s = hours + ":" + hours + ":" + second;

        g.setColor(Color.WHITE);
        g.fillRect(1, 1, this.getSize().width, this.getSize().height);
        // 填充一个矩形区域,x、y为起始坐标（即左上角坐标）,后面两个参数分别为：w、h,是矩形区域的宽和高
        g.setColor(Color.CYAN);
        g.drawString(s, 20, 80);    //20, 80分别是横坐标和竖坐标
    }
}
