package lld.factory_method.static_factory;

public class Client {
    public static void main(String[] args){
        User userOne = User.createAdminUser("Admin 1");
        System.out.println("Username: "+userOne.getUsername()+", Role: "+userOne.getRole());
    }
}
