package lambda.syntax;
import lambda.*;
/**
 * 语法稍稍简化
 */
public class BasicPro {
    public static void main(String[] args) {
        NoneReturnMutipleParameter lambda1 = (a,b)->{
            System.out.println("简化成功了,参数类型可以不写");
        };
        NoneReturnSingleParameter lambda2 = a ->
            System.out.println("有且仅有一个参数小括号也可以省略,如果只有一句话,大括号也可以省略");

    }
}
