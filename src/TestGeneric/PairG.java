package TestGeneric;

/**
 * 引入新的概念:类型擦除
 */
public class PairG {
    //以下是类型擦除的表现形式(在虚拟机中Pair类是什么样的状态)
    private Object first;
    private Object second;
    //.................
}
/**
 *可以看出,类型擦除其实就是把T全部替换成为了Obj
 * 如果没有限定他的类型,那么就会使obj
 * 如果限定了,就会顺位替换成为第一个限定
 * 因此最好是把没有方法的接口放在末尾来提高效率(因为会有一个强制类型转化)
 */