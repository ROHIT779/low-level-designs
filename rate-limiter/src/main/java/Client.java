import biz.RateLimiter;
import component.Payment;
import component.User;

import java.util.List;
import java.util.ArrayList;

public class Client {

    public static void main(String[] args){
        System.out.println("***** Rate Limiter *****");
        User user = new User(12);
        RateLimiter.addUser(user);
        int numberOfPayments = 8;
        List<Thread> queue = new ArrayList<>();

        for(int i=0; i<numberOfPayments; i++){
            Thread payment = new Thread(new Payment(i, user));
            queue.add(payment);
        }

        for(Thread payment : queue){
            payment.start();
        }
    }
}
