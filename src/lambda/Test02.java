package lambda;


import javax.swing.*;

public class Test02 {
    //接下来是方法的引用
    public static void main(String[] args) {
        var timer = new Timer(1000,event -> System.out.println(event));//定时执行后面的内容
        //但是这样代码还是显得有些复杂
        //因此在这里使用方法的引用或许会更好
        var timer2 = new Timer(1000,System.out::println);//至于隐式参数则看是不是在前面
        //同样的用this,super关键字也是正确的

    }
}
