package lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Test04 {
    //以下是关于方法的作用域(this永远是方法的this)
    public static void repeatMessage(String text,int delay){
        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay,listener).start();
    }

    public static void main(String[] args) {
        //接下来调用上述方法
        repeatMessage("hello",1000);

    }

}
