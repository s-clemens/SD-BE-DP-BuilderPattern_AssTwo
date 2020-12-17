package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.Room;
import nl.novi.dpcc.builder.domain.a.HouseA;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;
import nl.novi.dpcc.builder.domain.b.HouseB;
import nl.novi.dpcc.builder.domain.b.HouseBBuilder;
import nl.novi.dpcc.builder.domain.c.HouseC;
import nl.novi.dpcc.builder.domain.c.HouseCBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {



        Address adres1 = new Address("Kerkstraat", 12, "1234AD", "city", "");
        HouseA huis1 = new HouseABuilder()
                .withAddress(adres1)
                .withHouseType(HouseType.APPARTMENT)
                .build();
        System.out.println(huis1);

        Garden garden1 = new Garden(5, 10d, 20d);
        Garage garage1 = new Garage(10d, 20d, "door");
        HouseB huis2 = new HouseBBuilder(adres1, HouseType.VILLA)
                .withAddress(adres1)
                .withHouseType(HouseType.VILLA)
                .withGarage(garage1)
                .withGarden(garden1)
                .build();
        System.out.println(huis2);

        Room room1 = new Room(10d, 20d, "Kelder");
        Room room2 = new Room(10d, 30d, "Woonkamer");
        Room room3= new Room(30d,30d, "Badkamer");
        Room room4 = new Room(10d, 10d, "Het kleiste kamertje");

        List<Room> roomsList1 = new ArrayList<>();

        roomsList1.add(room1);
        roomsList1.add(room2);
        roomsList1.add(room3);

        HouseC huis3 = new HouseCBuilder(adres1, HouseType.HOUSE)
                .withAddress(adres1)
                .withHouseType(HouseType.HOUSE)
                .withGarage(garage1)
                .withGarden(garden1)
                .withRooms(roomsList1)
                .buildWithRoomCheck();

        System.out.println(huis3);
    }
}
