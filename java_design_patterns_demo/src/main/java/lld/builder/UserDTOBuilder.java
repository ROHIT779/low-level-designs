package lld.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstname(String fname);
    UserDTOBuilder withLastname(String lname);
    UserDTOBuilder withDob(LocalDate dob);
    UserDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO();
}
