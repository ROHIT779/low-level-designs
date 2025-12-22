package lld.builder;

public class UserWebDTO implements UserDTO {

    private String name;
    private String address;
    private String age;

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    //Private Setters to make Immutable object
    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getUserDetails() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Address: " + address;
    }
}
