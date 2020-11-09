package TestGeneric;

/**
 * 引入泛型概念,为什么要用泛型?
 * 可以对不同类型的变量重用代码
 * 同时可以让运行时错误变为编译时错误,更有利于维护
 */
public class ArrayList {
    //最开始的泛型是用继承来做到的,这样的其实就与多态类似
    private Object[] elementData;
    public Object get(int i){

        return new Object();
    }
    public void add(Object obj){

    }

    public static void main(String[] args) {
        ArrayList files = new ArrayList();
        String fileame = (String)files.get(0);
        var files1 = new ArrayList();//使用类型参数,使得代码的可读性更高了
        //观察上述代码,不难发现.当我们要用一个变量来获取返回值的时候,必须使用强制类型转换
    }
}
/**
 *上述例子时十分简单的,但是在实际开发之中,因为需要考虑到自己程序的用法,因此需要不断的插入各种类型的参数
 * 因此需要预判泛型类所有的用法
 */
