package lld.solid.single_responsibility.solution;

public class UserController {
    UserHelper helper = new UserHelper();

    public String createUser(String userName){
        String response = helper.createUser(userName);
        return response;
    }
}
