package TestGeneric;

import java.time.LocalDate;

/**
 * 引入新的概念:类型擦除
 */
public class PairG {
    //以下是类型擦除的表现形式(在虚拟机中Pair类是什么样的状态)
    private Object first;
    private Object second;
    //.................
}

//观察如下方法,不难发现(有两个setSecond方法,只有参数不同)调用的方法会根据引用类型变为限制更大的修饰
//这违背了多态,因此会生成一个桥方法,来保证多态性
class DateInterval extends Pair<LocalDate>{
    public void setSecond(LocalDate second){
        if(second.compareTo(getFirst())>=0){
            super.setSecond(second);
        }
    }
}
/**
 *可以看出,类型擦除其实就是把T全部替换成为了Obj
 * 如果没有限定他的类型,那么就会使obj
 * 如果限定了,就会顺位替换成为第一个限定
 * 因此最好是把没有方法的接口放在末尾来提高效率(因为会有一个强制类型转化)
 * 因此类型擦除伴随着一定会有强制类型转换
 * 类型转换仅需记住四点
 * 1.虚拟机中没有泛型,只有扑通的类和方法
 * 2.所有类型参数都会替换他们的限定类型
 * 3.会合成桥方法来保持多态
 * 4.为保持类型安全性,必要时会插入强制转换
 * 最后是泛型可以调用遗留代码(没有加以利用的代码)
 */