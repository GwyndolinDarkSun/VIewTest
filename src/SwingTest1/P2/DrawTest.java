package SwingTest1.P2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DrawTest {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            var frame = new DrawFrame();
            frame.setTitle("胡小龙是怎么样的呢");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class DrawFrame extends JFrame {
    public DrawFrame(){
        Toolkit toolkit = getToolkit();
        Dimension dimension = toolkit.getScreenSize();
        add(new DrawComponent());
        setSize(dimension.width/4,dimension.height/4);
    }



}
class DrawComponent extends JComponent{
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEITH = 400;
    
    public void paintComponent(Graphics graphics){
        Graphics2D g2 = (Graphics2D) graphics;
        
        double leftX = 10;
        double topY = 100;
        double width = 200;
        double height = 150;
        var rect = new Rectangle2D.Double(leftX,topY,width,height);
        g2.draw(rect);
    }
}