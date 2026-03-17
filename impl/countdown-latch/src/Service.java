import java.util.concurrent.CountDownLatch;

public class Service implements Runnable{

    private String name;
    private long delay;
    private final CountDownLatch latch;

    public Service(String name, long delay, CountDownLatch latch){
        this.name = name;
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run(){
        System.out.println("Service: "+name+" is starting...");
        try{
            Thread.sleep(1000);
            System.out.println("Service: "+name+" has started...");
            Thread.sleep(1000);
            System.out.println("Service: "+name+" has completed work");
            latch.countDown();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
