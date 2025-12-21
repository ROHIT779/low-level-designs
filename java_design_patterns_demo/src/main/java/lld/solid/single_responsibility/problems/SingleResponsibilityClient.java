package lld.solid.single_responsibility.problems;

public class SingleResponsibilityClient {

    public static void main(String[] args){
        UserController controller = new UserController();
        String response = controller.createUser("Rohit");
        System.out.println(response);
    }
}
