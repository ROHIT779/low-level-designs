package component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Bucket {
    private int capacity;
    private boolean[] tokens;
    private volatile int tokenIndex;
    private long lastRefillTime;
    private final ScheduledExecutorService refiller;
    public Bucket(int capacity){
        this.capacity = capacity;
        this.tokens = new boolean[capacity];
        this.tokenIndex = 0;
        lastRefillTime = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        refiller = Executors.newScheduledThreadPool(1);
        refill();
    }

    public synchronized boolean getToken(){
        System.out.println("Fetching token - token index: "+tokenIndex);
        if(this.tokenIndex >= capacity){
            return false;
        }
        this.tokens[tokenIndex] = true;
        tokenIndex++;
        return true;
    }

    public void refillBucket(){
        LocalDateTime currentTime = LocalDateTime.now();
        if(((currentTime.toEpochSecond(ZoneOffset.UTC) - lastRefillTime)
                > RefillRate.getTimeInSeconds()) && tokenIndex > 0) {
            Arrays.fill(tokens, false);
            tokenIndex = 0;
            System.out.println("Token Bucket is refilled");
        }
    }

    public void refill(){
        final Runnable task = ()->refillBucket();
        refiller.scheduleAtFixedRate(task, 1, RefillRate.getTimeInSeconds(), TimeUnit.SECONDS);
    }
}
