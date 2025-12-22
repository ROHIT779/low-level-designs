package lld.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstname;
    private String lastname;
    private String age;
    private String address;
    private UserWebDTO dto;
    @Override
    public UserDTOBuilder withFirstname(String fname) {
        this.firstname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastname(String lname) {
        this.lastname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withDob(LocalDate dob) {
        Period ageInYears = Period.between(dob, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getStreet() + ", " + address.getCity() + ", "
                + address.getState() + ", PIN: " + address.getPincode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstname + " " + lastname, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
