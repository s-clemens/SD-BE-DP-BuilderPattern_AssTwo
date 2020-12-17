package nl.novi.dpcc.builder.domain.c;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.Room;
import nl.novi.dpcc.builder.domain.b.HouseB;
import nl.novi.dpcc.builder.domain.b.HouseBBuilder;

import java.util.List;

public class HouseCBuilder {

    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    // Minimaal 1 kamer is verplicht
    private List<Room> rooms;

    public HouseCBuilder(Address address, HouseType houseType){
        this.address = address;
        this.houseType = houseType;
    }

    public HouseCBuilder withAddress(Address address){
        this.address = address;
        return this;
    }

    public HouseCBuilder withHouseType(HouseType housetype){
        this.houseType = housetype;
        return this;
    }

    public HouseCBuilder withGarden(Garden garden){
        this.garden = garden;
        return this;
    }

    public HouseCBuilder withGarage(Garage garage){
        this.garage = garage;
        return this;
    }

    public HouseCBuilder withRooms(List<Room> rooms){
        this.rooms = rooms;
        return this;
    }

    public HouseC buildWithRoomCheck(){
        if (this.rooms.size() >= 1){
            return new HouseC(address, houseType, rooms);
        } else{
            throw new RuntimeException("Please add more rooms");
        }

    }

}
