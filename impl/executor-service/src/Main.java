import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Without using Future with Runnable
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()->{
            System.out.println("Thread: "+Thread.currentThread().getName()+" executing...");
        });
        executorService.submit(()->{
            System.out.println("Thread: "+Thread.currentThread().getName()+" executing...");
        });
        executorService.shutdown();

        //Using Future and Callable
        executorService = Executors.newSingleThreadExecutor();
        Future<String> futureResult = executorService.submit(()->{
            Thread.sleep(1000);
            return "Thread: "+Thread.currentThread().getName()+", Message: Task completed!";
        });
        for(int i=0;i<10;i++){
            System.out.println("Thread "+Thread.currentThread().getName()+" is doing some work...");
        }
        String result = futureResult.get();
        System.out.println(result);
        executorService.shutdown();
    }
}
