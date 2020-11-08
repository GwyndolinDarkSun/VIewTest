package nbl;

public class Test02 {
    //接下来是匿名内部类的调用
    public static void main(String[] args) {
        show(new Animal() {//免去了建类实现接口实例化的过程
            @Override
            public void showName() {
                System.out.println("修改后的:" + name);
            }
        });
    }
    public static void show(Animal animal){
        animal.showName();

    }
}

interface Animal{
    String name = "动物";
    default void showName(){
        System.out.println(name);

    }
}

/*
内部类在静态方法中必须是静态的,因为该方法就是在类加载时加载
静态内部类不能引用外部类的实例变量,因为其加载时是类加载之时
 */