package lld.builder;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args){
        User user = createUser();
        UserWebDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO userDTO = directBuild(builder, user);
        System.out.println(userDTO.getUserDetails());
    }

    //Director
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        return builder.withFirstname(user.getFirstname())
                .withLastname(user.getLastname())
                .withDob(user.getDob())
                .withAddress(user.getAddress())
                .build();
    }
    public static User createUser(){
        Address address = new Address();
        address.setStreet("16 MG Road");
        address.setCity("Bangalore");
        address.setPincode("560048");
        address.setState("Karnataka");
        LocalDate dob = LocalDate.of(1982, 12, 25);
        User user = new User();
        user.setFirstname("Robin");
        user.setLastname("Agarwal");
        user.setDob(dob);
        user.setAddress(address);
        return user;
    }
}
