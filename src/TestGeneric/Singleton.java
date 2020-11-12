package TestGeneric;
//7.不能在静态字段或方法中使用类型变量
public class Singleton<T> {
    //private static T singleInstance;
    //public static T getSingleInstance(){};因为静态字段中都是编译时执行的,而要转化为我们的T则是在运行时
}

//8.不能抛出泛型的实例,还是一个理由,运行时结束的类型擦除无法影响编译时

//9.可以取消对检查形异常的检查(多线程复习结束回过头来再看!!!)

//10.注意擦除后的冲突
/**
class PairC<T>{
    public boolean equals(T value){
        return first.equals(valeu);
    }因为类型擦除之后,同样是调用equals方法,但是我们究竟是调用哪一个??obj也有一个equals方法啊!!因此这里就会冲突
}
 为了解决这个问题,我们需要遵守泛型的另外一个原则:
 为了支持类型擦除的转换,我们要是加一个限制:倘若两个接口是同一个接口的不同参数化,一个类或类型变量,就不嫩那个同时作为连个接口类型的子类
 这样就有效避免了究竟是调用谁的属性(方法)的问题了
*/