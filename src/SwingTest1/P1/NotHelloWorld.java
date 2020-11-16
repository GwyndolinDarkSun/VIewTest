package SwingTest1.P1;

import javax.swing.*;
import java.awt.*;

/**
 * 这里是整体的一个实现
 */
public class NotHelloWorld {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{//分出制作窗体的线程
            var frame = new NotHelloWorldFrame();//实例化窗体对象
            frame.setTitle("胡小龙性格");//设置输入的文本
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class NotHelloWorldFrame extends JFrame{//窗体类,继承了窗体属性的类
    public NotHelloWorldFrame(){
        //先获取屏幕的大小
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = t.getScreenSize();//返回了包含屏幕属性的对象

        add(new NoteHelloWorldComponent());//加入一个组件对象
        setSize(screenSize.width/4,screenSize.height/4);
    }
}

class NoteHelloWorldComponent extends JComponent{//组件对象需要继承相应的类
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;//文本的位置

    public void paintComponent(Graphics g){//显示文本的绘制
        g.drawString("吃亏~~~~~~~",MESSAGE_X,MESSAGE_Y);
    }

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGH = 200;//文本的长和宽

    public Dimension gePreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGH);
    }
}
