package nl.novi.dpcc.builder.domain;

public class Address {

    private String streetName;
    private int houseNumber;
    private String houseNumberAddition; // Niet verplicht
    private String postalCode;
    private String province; // Niet verplicht

    //TODO: lege constructor verwijderen
    public Address(){

    }


    public Address(String streetName, int houseNumber, String postalCode) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
    }

    public void setHouseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getHouseNumberAddition() {
        return houseNumberAddition;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }
}
