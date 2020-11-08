package nbl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 内部类的使用原因(虽然大多情况用lambda表达式会显得更加的简洁)
 * 1.内部类可以对其他类隐藏
 * 2.内部类方法可以访问该类的私有方法
 * 因为其天生就具有更高的访问权限,因此功能更加强大
 */

public class Test01 {
    private int interval;
    private boolean beep;
    public Test01(int interval,boolean beep){

    }
    public void start(){

    }
    //Test001类并没有定义变量但是可以使用 interval 和 beep变量(因为这里有一个隐匿的引用)
    public class Test001 implements ActionListener {
        //beep = Test01.this.beep
        //interval = Test01.this.interval
        //而构造器则是Test01.new Test001(){}的形式
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
/**
 * 局部内部类有一个很大的优势,就是对外界完全隐藏(但有一个问题和lambda表达式一样,那就是局部变量必须是事实最终变量)
 */
