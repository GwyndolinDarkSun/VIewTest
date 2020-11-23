package BF.P1;

public class TreadTest {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i = 1;i < 100;i +=2){
                System.out.println("线程2" + i);
            }
        };
        Thread thread = new Thread(r);
        thread.start();
        for(int i= 1;i < 100;i +=4){
            System.out.println("线程1" + i);
        }
    }
}
