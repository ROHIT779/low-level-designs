package component;

import biz.RateLimiter;

public class Payment implements Runnable{

    private final int index;
    private final User user;
    public Payment(int index, User user){
        this.index = index;
        this.user = user;
    }

    public void run(){
        System.out.println("Payment: " + index + " started...");

        boolean response = RateLimiter.limit(user);
        if(response){
            System.out.println("Payment: "+index+" allowed");
        } else{
            System.out.println("Payment: "+index+" rate limited");
        }
    }
}
