package simpleClock.control;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Screen {
    public static Dimension getScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //设置窗口位置
        return screenSize;
    }
}
