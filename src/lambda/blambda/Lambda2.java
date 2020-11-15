package lambda.blambda;

/**
 * 这里是构造方法的方法引用
 */
public class Lambda2 {
    private static class Person{
        String name;
        int age;
        public Person(){
            System.out.println("无参构造执行了");
        }
        public Person(int a){
            this.age = a;
            System.out.println("Person类有参构造执行了");
        }
        public Person(String name,int age){
            this.age = age;
            this.name = name;
        }

        private static interface GetPerson{
            Person get();
        }

        public static void main(String[] args) {
            //使用lambda表达式来实现
            GetPerson get1 = ()-> new Person();
            GetPerson get2 = Person::new;//引用构造方法都是new
            Person person = get2.get();

        }
    }
}
