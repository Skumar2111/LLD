package DesignPattern.Creational.Factory;

public class MainFactory {

    public static void main(String[] args) {

        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        FactoryClient twoWheelerClient = new FactoryClient(twoWheelerFactory);

        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        FactoryClient fourWheelerClient = new FactoryClient(fourWheelerFactory);

        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}
