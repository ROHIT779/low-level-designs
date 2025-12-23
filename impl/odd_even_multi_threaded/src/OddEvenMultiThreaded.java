import java.lang.Thread;

public class OddEvenMultiThreaded {

    private static int max = 20;

    public static void main(String[] args){
        Integer num = 0;
        Thread t1 = new Thread(new T1(10), "T1");
        Thread t2 = new Thread(new T2(10), "T2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
