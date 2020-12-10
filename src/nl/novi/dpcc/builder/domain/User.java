package nl.novi.dpcc.builder.domain;

public class User {
    private String firstName;
    private String lastName;

    // Niet verplichte velden
    private String userName;
    private String passwordOne;
    private String passwordTwo;


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswordOne(String passwordOne) {
        this.passwordOne = passwordOne;
    }

    public void setPasswordTwo(String passwordTwo) {
        this.passwordTwo = passwordTwo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }
}
