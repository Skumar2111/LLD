package DesignPattern.Factory;

public class FactoryClient {

    private Vehicle vehicle;

    public FactoryClient(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle()
    {
        return vehicle;
    }
}
