package lambda.syntax;
import lambda.*;
public class BasicSyntax {
    public static void main(String[] args){
        NoneReturnNoneParameter lambda1 = () ->{
            System.out.println("这是一个无参无返回值的方法");
        };//这里就实现了方法
        lambda1.test();

        NoneReturnSingleParameter lambda2 = (int a) ->{//这里仅仅是给形参放的
            System.out.println("这是一个参数无返回值的方法.参数a = " + a);
        };
        lambda2.test(10);

        NoneReturnMutipleParameter lambda3 = (int a,int b) -> {
            System.out.println("这是多个参数无返回值的方法.参数a = " + a + " b = " + b);
        };
        lambda3.test(10,29);

        SingleReturnNoneParameter lambda4 = () -> {
            System.out.println("这是无参数有返回值的方法,返回值是:");//调用就会走,返回值才是输出
            return 10;
        };
        System.out.println(lambda4.test());

        SingleReturnSingleParameter lambda5 = (int a) -> {
            System.out.println("这是有参数有返回值的方法.参数是: " + a);
            System.out.println("返回值是: ");
            return a*10;
        };
        System.out.println(lambda5.test(10));

        SingleReturnMutipleParameter lambda6 = (int a,int b)->{
            System.out.println("这是多个参数有返回值的方法");
            System.out.println("返回值是: ");
            return a*b;
        };
        System.out.println(lambda6.test(12,13));


    }
}
