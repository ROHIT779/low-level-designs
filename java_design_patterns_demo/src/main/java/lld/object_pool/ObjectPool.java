package lld.object_pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable>{

    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count){
        availablePool = new LinkedBlockingQueue<T>();
        for(int i = 0; i<count; i++){
            availablePool.offer(creator.get());
        }
    }

    public T get(){
        try{
            return availablePool.take();
        } catch(InterruptedException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void release(T obj){
        obj.reset();
        try{
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Object released");
    }
}
