package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 其实就是需要用到某个函数式接口的时候(仅仅需要一个方法,即对应动作)用lambda来直接实现这个动作
 * 三大特点:代码块,参数,自由变量的值
 * 千万别让lambda表达式引用一个会改变的变量(事实最终变量)这样才能保证并发的时候是安全的
 */

public class Test01 {
    public static void main(String[] args) {
        //lambda表达式就是一个"动作",这是一种函数式编程
        //(String first,String second) -> first.length()-second.length()
        Comparator <String> cmp = (a,b) -> a.length() - b.length();
        var planets = new String[]{"c","cc","cccccccc","cccc","","ccccccc"};
        Arrays.sort(planets,(a,b) -> a.length() - b.length());
        for(String tmp:planets){
            System.out.println(tmp);
        }
        //明显的式向sort方法中传递了一个动作
        //lambda表达式的有益指出就是在于可以仅提供需要的方法,我们只需要根据用途构造函数式接口(有抽象方法)就行了
        //因为在实现抽象方法的时候就会自己的拟定一个"动作",而这个动作可以用lambda表达式轻松的取代


    }

}
