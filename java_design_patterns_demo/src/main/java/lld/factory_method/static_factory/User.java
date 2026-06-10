package lld.factory_method.static_factory;

public class User {
    private final String username;
    private final String role;

    private User(String name, String role){
        username=name;
        this.role=role;
    }

    public static User createStandardUser(String name){
        return new User(name,"GUEST");
    }

    public static User createAdminUser(String name){
        return new User(name,"ADMIN");
    }

    public String getUsername(){
        return username;
    }

    public String getRole(){
        return role;
    }
}
