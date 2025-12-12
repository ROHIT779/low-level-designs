package biz;

import component.Bucket;
import component.RefillRate;
import component.User;

import java.util.HashMap;
import java.util.Map;

public class RateLimiter {
    private static Map<User, Bucket> users = new HashMap<>();

    public static boolean limit(User user){
        Bucket b = users.get(user);
        return b.getToken();
    }

    public static void addUser(User user){
        users.put(user, new Bucket(RefillRate.getValue()));
    }

}
