package nl.novi.dpcc.builder.domain;

public class AddressBuilder {

    private String streetName;
    private int houseNumber;
    private String houseNumberAddition; // Niet verplicht
    private String postalCode;
    private String province; // Niet verplicht

    public AddressBuilder withStreetName(String streetName){
        this.streetName = streetName;
        return this;
    }

    public AddressBuilder withHousNumber(int houseNumber){
        this.houseNumber = houseNumber;
        return this;
    }

    public AddressBuilder withPostalCode(String postalCode){
        this.postalCode = postalCode;
        return this;
    }

    public AddressBuilder withHouseNumberAddition(String houseNumberAddition){
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public AddressBuilder inProvince(String province){
        this.province = province;
        return this;
    }

    public Address build(){
        if(streetName == null){
            throw new RuntimeException("Address cannot be empty");
        }

        if(houseNumber == 0){
            throw new RuntimeException("House number must be defined");
        }

        if(postalCode == null){
            throw new RuntimeException("Postal code must be defined");
        }

        Address address = new Address(streetName, houseNumber, postalCode);

        if(houseNumberAddition!= null){
            address.setHouseNumberAddition(houseNumberAddition);
        }

        if(province!= null){
            address.setProvince(province);
        }

        return address;
    }
}
