package nl.novi.dpcc.builder.domain;

public class UserAdress {
    User user;
    Address address;

    public UserAdress(User user, Address address) {
        this.user = user;
        this.address = address;
    }
}
