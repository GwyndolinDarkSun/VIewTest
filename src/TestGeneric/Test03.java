package TestGeneric;

/**
 * 这里是泛型中的通配符
 */
public class Test03 {
    //Pair<? extend Employee>
    //这就表示了只要是继承了Employee的都可以替换这个?
    //但是可以get()却不能set()
    //这是因为get()是不需要传递参数的,而set需要传递参数,这就需要编译器去判断这个参数的类型,set()一般都是带有通配符的类型
    //因此会出错(主要是在编译阶段,不会有填充物)(进去的时候可能会发生破坏)编译器会自动判断
    //Pair<? super Employee>这个可以set()却不能get()这与上述刚好相反!不知道是谁因此直接给他了一个Manager
    //因为根本不知道能不能从中取出来这样一个对象出来
    public static void main(String[] args) {
        //其实Pair和Pair<?>只是感觉起来一样,实际上却是完全不同的
    }
    public static void printBuddies(Pair<Employee> p){
        Employee first = p.getFirst();
        Employee second = p.getSecond();
    }

    //那么为什么要用<?>这个弱小的家伙呢(可以测试一个对组是否包含null引用)仅仅是泛型类才会用到!!
    public static boolean hasNulls(Pair<?> pair){
        return pair.getFirst() == null || pair.getSecond() == null;//话说这样的可读性真的更好吗???
    }


    //显然不可能使用通配符去定义一个变量
    //但是可以通过包装一下的方式来间接性的做到
    public static void swap(Pair<?> p){
        //? T = p.getFirst();
    }
    public static <T> void swapHeleper(Pair<T> p){
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
/**
 * 总之super就不能读取(接),extend就不能插入
 * 无限定通配符和原本的区别仅仅是原本的Pair类可以用Obj调用setFirst()方法
 * 通配符的捕获只有在非常限定的情况下是合法的
 */