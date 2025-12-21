package lld.solid.single_responsibility.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserHelper {
    Map<String, User> dataStore = new HashMap<>();

    public String createUser(String userName){
        String userID = UUID.randomUUID().toString();
        User user = new User(userID, userName);
        try{
            dataStore.put(userID, user);
        } catch(Exception e){
            return "FAILED";
        }
        return "SUCCESS";
    }
}
