package TestGeneric;

/**
 * 这里是对一个泛型类的使用
 */
public class pair1 {
    public static void main(String[] args){
        String[] words = {"Mary","had","a","little","lamb"};
        Pair<String> mm = ArrayAlg1.minmax(words);
        System.out.println("min = "+ mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg1{//不过就是求一个最大最小值罢了
    public static Pair<String> minmax(String[] a){
        if(a == null || a.length == 0){
            return null;
        }
        String min = a[0];
        String max = a[0];
        for(int i = 1 ;i < a.length;i ++){
            if(min.compareTo(a[i]) > 0){
                min = a[i];
            }else if(max.compareTo(a[i]) < 0){
                max = a[i];
            }
        }
        return new Pair<>(min,max);//这里调用了Pair类的构造方法
    }
}
