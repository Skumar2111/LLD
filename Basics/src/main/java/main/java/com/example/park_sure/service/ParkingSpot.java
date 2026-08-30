package main.java.com.example.park_sure.service;

import com.example.park_sure.service.enums.SpotType;

import java.util.concurrent.locks.ReentrantLock;

public class ParkingSpot {

    String id;
    SpotType type;
    ParkingFloor floor;
    boolean isAvailable;
    Vehicle vehicle;

    ReentrantLock spotLock = new ReentrantLock();


    public boolean isAvailable()
    {
        return true;
    }

    public boolean canFit()
    {
        return true;
    }

    public boolean occupySpot(Vehicle vehicle) {

        if (!spotLock.tryLock()) {
            return false;
        }

        try {
            if (!isAvailable) {
                return false;
            }

            this.vehicle = vehicle;
            this.isAvailable = false;

            return true;

        } finally {
            spotLock.unlock();
        }
    }


    public void releaseSpot()
    {
        this.isAvailable = true;
    }

    public SpotType getType()
    {
        return SpotType.BIKE_SPOT;
    }

    public Vehicle getVehicle()
    {
        return new Vehicle();
    }


}
