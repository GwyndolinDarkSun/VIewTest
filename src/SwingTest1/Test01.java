package SwingTest1;
/**
 * 这里主要是屏幕宽度等的设置
 */

import java.awt.*;
import javax.swing.*;
public class Test01 {
    public static void main(String[] args) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();//获取屏幕属性
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;//分别获取长和宽
        //setSize(screenWidth/4,screenHeight/4);设置长和宽
        //Image img= new ImageIcon("icon.gif");getImage();
        //setIconImage(img);
    }
}
