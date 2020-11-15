package lambda.blambda;

/**
 * 函数的引用
 */
public class Lambda1 {
    //这里用一下静态内部类
    private static interface Calculate{
        int calculate(int a,int b);
    }
    public static void main(String[] args) {
        //Calculate calculate = (x,y)->calulate(x,y);
        //System.out.println(calculate.calculate(10,10));
        //没有体现函数引用

        Calculate cal = Lambda1::calulate;//这里不要加括号
        System.out.println(cal.calculate(10,10));
        Calculate cal1 = (new Lambda1())::calulate2;
        System.out.println(cal1.calculate(10,10));//方法名直接变成了函数的方法名
    }

    private static int calulate(int x,int y){
        if(x > y){
            return x - y;
        }else if (x < y){
            return y - x;
        }else{
            return x * y;
        }

    }
    private int calulate2(int a,int b){
        return a*a*b*100;
    }
}
