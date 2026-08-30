package main.java.com.example.park_sure.service;

import java.util.List;

public class ParkingLot {

    String id;
    String name;
    String address;
    List<ParkingFloor> floorList;

    /*  ------   */

    public void addFloor(ParkingFloor floor)
    {
        floorList.add(floor);
    }

    public void removeFloor(int id)
    {
        floorList.removeIf(floorList -> (floorList.number == id));
    }

    public Ticket parkVehicle(Vehicle vehicle)
    {
        return new Ticket();
    }


    public void unParkVehicle(String ticketId,PaymentService paymentService)
    {

    }


    public int getAvailableParkingSpots()
    {
        return 1;
    }

}
