//package nl.novi.dpcc.builder.domain;
//
//public class AddressBuilder {
//
//    private String streetName;
//    private int houseNumber;
//    private String postalCode;
//    private String city;
//
//    //Niet verplicht
//    private String houseNumberAddition;
//
//    public AddressBuilder(String streetName, int houseNumber, String postalCode, String city){
//
//    }
//
//    public AddressBuilder withStreetName(String streetName){
//        this.streetName = streetName;
//        return this;
//    }
//
//    public AddressBuilder withHouseNumber(int houseNumber){
//        this.houseNumber = houseNumber;
//        return this;
//    }
//
//    public AddressBuilder withHouseNumberAddition(String houseNumberAddition) {
//        this.houseNumberAddition = houseNumberAddition;
//        return this;
//    }
//
//    public AddressBuilder withPostalCode(String postalCode){
//        this.postalCode = postalCode;
//        return this;
//    }
//
//    public AddressBuilder withCity(String city){
//        this.city = city;
//        return this;
//    }
//
//    public AddressBuilder build(){
//        return new Address(streetName, houseNumber, postalCode, city, houseNumberAddition);
//    }
//
//}
