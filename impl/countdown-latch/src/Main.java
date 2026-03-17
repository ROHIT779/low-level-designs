import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args){
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Service("Database Service", 1000, latch));
        executorService.submit(new Service("Cache Service", 2000, latch));
        executorService.submit(new Service("Notification Service", 3000, latch));
        try{
            System.out.println("Main thread is waiting...");
            latch.await();
            System.out.println("Main thread is done");
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        executorService.shutdown();
    }
}
