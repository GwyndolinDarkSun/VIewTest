package lambda.blambda;
import lambda.*;
/**
 * lambda中需要注意的地方
 */
public class Lambda3 {
    public static void main(String[] args) {
        //定义一个局部变量
        int x = 10;
        //使用lambda表达式实现接口
        NoneReturnNoneParameter n = ()-> System.out.println("x = " + x);
        //修改变量x的值
        //x = 20;马上就会报错(这里对局部变量形成了一个包围)(闭包不能改变)
    }
}
