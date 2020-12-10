package nl.novi.dpcc.builder.domain;

public class UserBuilder {
    private String firstName;
    private String lastName;

    // Niet verplichte velden
    private String userName;
    private String passwordOne;
    private String passwordTwo;

    public UserBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withUserName(String userName){
        this.userName = userName;
        return this;
    }

    public UserBuilder withPasswordOne(String passwordOne){
        this.passwordOne = passwordOne;
        return this;
    }

    public UserBuilder withPasswordTwo(String passwordTwo){
        this.passwordTwo = passwordTwo;
        return this;
    }

    public User build(){
        if (firstName == null){
            throw new RuntimeException("First name cannot be empty");
        }
        if (lastName == null){
            throw new RuntimeException("Last name cannot be empty");
        }

        User user = new User(firstName, lastName);

        if (userName!= null){
            user.setUserName(userName);
        }

        if (passwordOne != null){
            user.setPasswordOne(passwordOne);
        }

        if (passwordTwo != null){
            user.setPasswordTwo(passwordTwo);
        }

        return user;
    }



}
