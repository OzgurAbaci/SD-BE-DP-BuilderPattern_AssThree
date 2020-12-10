package nl.novi.dpcc.builder.payload.request;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.AddressBuilder;
import nl.novi.dpcc.builder.domain.User;
import nl.novi.dpcc.builder.domain.UserBuilder;

public class RegisterUserRequest {

    private String firstName;
    private String lastName;
    private String streetName;
    private int houseNumber;
    private String houseNumberAddition; // Niet verplicht
    private String postalCode;
    private String province; // Niet verplicht

    // Niet verplichte velden
    private String userName;
    private String passwordOne;
    private String passwordTwo;


    public User getUser(){
        return new UserBuilder()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withUserName(userName)
                .withPasswordOne(passwordOne)
                .withPasswordTwo(passwordTwo)
                .build();
    }

    public Address getAdress(){
        Address address = new AddressBuilder()
                .withStreetName(streetName)
                .withHousNumber(houseNumber)
                .withHouseNumberAddition(houseNumberAddition)
                .withPostalCode(postalCode)
                .inProvince(province)
                .build();
        return address;
//        Address tempAddress = new Address();
//        return tempAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumberAddition() {
        return houseNumberAddition;
    }

    public void setHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordOne() {
        return passwordOne;
    }

    public void setPasswordOne(String passwordOne) {
        this.passwordOne = passwordOne;
    }

    public String getPasswordTwo() {
        return passwordTwo;
    }

    public void setPasswordTwo(String passwordTwo) {
        this.passwordTwo = passwordTwo;
    }
}
