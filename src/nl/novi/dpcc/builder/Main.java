package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.User;
import nl.novi.dpcc.builder.domain.UserAdress;
import nl.novi.dpcc.builder.payload.request.RegisterUserRequest;

public class Main {

    public static void main(String[] args) {


        RegisterUserRequest request = new RegisterUserRequest();
        request.setFirstName("Willem");
        request.setLastName("van Buuren");
        request.setStreetName("'s-Gravenhaagse Bos");
        request.setHouseNumber(10);
        request.setPostalCode("2594 BD");
        request.setProvince("Zuid-Holland");
        request.setUserName("WAvanBuuren");
        request.setPasswordOne("Maxima");

        User willem = request.getUser();
        Address huisTenBosch = request.getAdress();
        UserAdress willemsAdres = new UserAdress(willem, huisTenBosch);


    }
}
