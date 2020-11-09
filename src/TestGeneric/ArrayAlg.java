package TestGeneric;

/**
 * 以下是一个泛型方法
 */
public class ArrayAlg {
    public static  <T> T getMiddle(T... a){//永远是先定义才能做返回值,无论是泛型类还是泛型方法
        return a[a.length / 2];//获取中间元素(推测length因该是一个属性)
    }

    public static void main(String[] args) {
        //以下是泛型方法的调用,菱形运算符放在了前面
        String middle = ArrayAlg.<String>getMiddle("john","Q","Public");//菱形运算符可以忽略,因为编译器会自动预判
        System.out.println(middle);
        System.out.println("sas");
        double middle1 = ArrayAlg.getMiddle(12.5,13.5,14.5); //这里后面元素必须全为double否则编译器会认为是int从而报错
    }
}
