package main.java.com.example.park_sure.service;

import com.example.park_sure.service.enums.VehicleType;

public class Vehicle {

    String licensePlate;
    VehicleType vehicleType;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
