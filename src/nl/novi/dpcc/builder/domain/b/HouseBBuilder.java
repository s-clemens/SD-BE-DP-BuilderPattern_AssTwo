package nl.novi.dpcc.builder.domain.b;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;

public class HouseBBuilder {

    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    public HouseBBuilder(Address address, HouseType houseType){
        this.address = address;
        this.houseType = houseType;
    }

    public HouseBBuilder withAddress(Address address){
        this.address = address;
        return this;
    }

    public HouseBBuilder withHouseType(HouseType housetype){
        this.houseType = housetype;
        return this;
    }

    public HouseBBuilder withGarden(Garden garden){
        this.garden = garden;
        return this;
    }

    public HouseBBuilder withGarage(Garage garage){
        this.garage = garage;
        return this;
    }

    public HouseB build(){
        return new HouseB(address, houseType, garden, garage);
    }



}
