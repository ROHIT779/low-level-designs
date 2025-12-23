public class T1 implements Runnable{
    private static final Object lock = Counter.getLock();
    private int max = 0;
    public T1(int max){
        this.max = max;
    }

    public void run(){
            while(true){
                synchronized (lock){
                    if(Counter.counter > max){
                        lock.notifyAll();
                        return;
                    } else{
                        if(Counter.counter%2 == 0){
                            System.out.println("T1 prints "+ Counter.counter++);
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
