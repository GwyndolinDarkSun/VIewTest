package TestGeneric;

import java.util.Collection;

/**
 * 这里将说明java中泛型的一些使用上面的限制
 */
public class Test01 {
    //1.不能用基本类型代替类型参数,而要使用他们对应的装箱类型,原因就在类型擦除的时候,基本数据类型怎么用object代替呢??
    public static void main(String[] args) {
        //2.运行时查询只适用于原始类型
        //if(a instanceof Pair<String>);这里,不会是判断属于Pair<String>,而是会判断属于任意的Pair

        //3.不能创建参数化类型数组(但是声明类型是合法的,Java不支持泛型数组)(可以用注解解除相关限制)
        //var table = new Pair<String>[10];Error
        //这是因为擦除时会暂时变成一个obj类型,而数组会记住他的元素类型
        //Object[] obj = table;
        //obj[0] = "hello";
        //这样虽然可以通过编译,但是擦除会使得上述机制变得无效(结合上述法则2),从而让代码可能抛出异常
        //实在要初始化可以Array List:ArrayList<Pair<String>>就行了(如果用硬是要上面方法,然后强转,则同样不安全)



    }
    //4.Varargs警告
    public static <T> void addAll(Collection<T> coll,T... ts){//ts就是一个数组
        for(T t: ts){
            //coll.add(T);这里就报错了(原因于上述一样,Java要达到如下目的必须创建Pari<T>的数组,来保证程序的正确,这与上述冲突了)
        }
    }

}
