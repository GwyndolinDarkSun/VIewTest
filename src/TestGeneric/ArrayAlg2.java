package TestGeneric;

import java.io.Serializable;

/**
 * 类型变量的限定
 * 有些时候需要对类型变量进行约束
 */
public class ArrayAlg2 {
    public static <T extends Comparable & Serializable> T min(T[] a){//继承(实现)了Comparable接口就保证了其一定具有compareTo()方法
        //这里可以使用通配符
        if(a == null || a.length == 0){
            return null;
        }
        T smallest = a[0];
        for(int i = 1 ; i < a.length;i ++ ) {
            if (smallest.compareTo(a[i]) > 0) {
                smallest = a[i];
                //这里调用了compareTo()方法,因此需要告诉编译器我们的T是具有compareTo()方法的
            }
        }
        return smallest;
    }
}
/**
 * 这里会产生一种疑惑,为什么是extends而不是implements
 */
