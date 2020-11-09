package TestGeneric;

import java.io.Serializable;

/**
 * 这里重写下,将其定位泛型方法,而不是一个泛型类
 */
public class pair2 {

}

class ArrayAlg3{
    public static <T extends Comparable & Serializable> Pair<T> minmax(T[] a){//这里返回值的泛型符号不要忘记了哦
        if(a == null || a.length == 0){
            return null;
        }
        T max = a[0];
        T min = a[0];
        for(int i = 1;i < a.length;i ++){
            if(min.compareTo(a[i]) > 0){
                min = a[i];
            }
            if(max.compareTo(a[i]) < 0){
                max = a[i];
            }
        }
        return new Pair<>(min,max);

    }
}
