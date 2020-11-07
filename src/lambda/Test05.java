package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test05 {
    //再谈Comparator
    //因为其中许多的静态方法可以用lambda表达式或者方法引用
    public static void main(String[] args) {
        var people = new Person[]{new Person("a"),new Person("b"),new Person("c")};
        Arrays.sort(people, Comparator.comparing(Person::getName));
        Arrays.sort(people, Comparator.comparing(Person::getName));
    }


}
