import java.util.List;
import java.util.ArrayList;

class DataQueue{
    private int maxSize;
    private int currentSize = 0;
    private List<Message> queue;
    private final Object IS_NOT_FULL = new Object();
    private final Object IS_NOT_EMPTY = new Object();

    DataQueue(int maxSize){
        this.maxSize = maxSize;
        this.queue = new ArrayList<>(maxSize);
    }

    public void waitIsNotFull() throws InterruptedException {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.wait();
        }
    }

    private void notifyIsNotFull() {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.notify();
        }
    }

    public void waitIsNotEmpty() throws InterruptedException {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.wait();
        }
    }

    public void notifyIsNotEmpty() {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.notify();
        }
    }

    public void add(Message message) {
        queue.add(message);
        currentSize++;
        notifyIsNotEmpty();
    }

    public Message remove() {
        Message mess = queue.get(0);
        queue.remove(0);
        currentSize--;
        notifyIsNotFull();
        return mess;
    }

    public boolean isFull(){
        return currentSize == maxSize ? true : false;
    }

    public boolean isEmpty(){
        return currentSize <= 0 ? true : false;
    }

}