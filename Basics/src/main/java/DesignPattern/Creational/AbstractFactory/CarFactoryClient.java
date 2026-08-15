package DesignPattern.Creational.AbstractFactory;

public class CarFactoryClient {

    public static void main(String[] args) {

        CarFactory europeanCarFactory = new EuropeanCarFactory();
        Car europeanCar = europeanCarFactory.createCar();
        CarSpecification carSpecification = europeanCarFactory.createSpecification();

        europeanCar.assemble();
        carSpecification.display();

    }
}
