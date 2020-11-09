package TestGeneric;

/**
 * 本类只需要关注泛型,而不必因为数据储存细节而分心
 * 使用之时就是用实际的
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair(){
        first = null;
        second = null;
    }

    public Pair(T first,T second){
        this.first = first;
        this.second = second;
    }

    public  T getFirst(){
        return  first;
    }
    public T getSecond(){
        return second;
    }

    public void setFirst(T newValue){
        this.first = newValue;
    }
    public void setSecond(T newValue){
        this.second = newValue;
    }
}
