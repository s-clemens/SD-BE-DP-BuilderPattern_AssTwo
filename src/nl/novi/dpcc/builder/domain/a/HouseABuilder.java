package nl.novi.dpcc.builder.domain.a;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseABuilder {

    private Address address;
    private HouseType houseType;

    public HouseABuilder(){
    }

    public HouseABuilder withAddress(Address address){
        this.address = address;
        return this;
    }

    public HouseABuilder withHouseType(HouseType houseType){
        this.houseType = houseType;
        return this;
    }

    public HouseA build(){
        return new HouseA(address,houseType);
    }

}



