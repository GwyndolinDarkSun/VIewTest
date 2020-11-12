package TestGeneric;

import java.util.function.Supplier;

public class Test02 {
    public static void main(String[] args) {
        //6.不能构造泛型数组(数组可以null貌似安全实则不然)

    }
    //5.不能实例化类型变量
    //second = new T;显然会报错!!
    public static <T> Pair<T> makePair(Supplier<T> constr){//这是一个函数式接口
        return new Pair<>(constr.get(), constr.get());//类型的擦除会使得变成Object.class
    }

    //6.不能构造泛型数组(数组可以null貌似安全实则不然)
    public static <T extends Comparable> T[] minmax(T... a){
        //T[] mm = new T[2];
        //return mm;这里显然就会报错了,因为类型擦除的存在,这会使得我们永远都是构造Comparable数组
        return null;
    }
}
