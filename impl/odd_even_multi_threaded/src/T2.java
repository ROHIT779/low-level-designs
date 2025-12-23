public class T2 implements Runnable{
    private static final Object lock = Counter.getLock();
    private int max = 0;
    public T2(int max){
        this.max = max;
    }

    public void run(){
        while(true){
            synchronized (lock){
                if(Counter.counter > max){
                    lock.notifyAll();
                    return;
                } else{
                    if(Counter.counter%2 == 1){
                        System.out.println("T2 prints "+ Counter.counter++);
                        lock.notify();
                    }else{
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
