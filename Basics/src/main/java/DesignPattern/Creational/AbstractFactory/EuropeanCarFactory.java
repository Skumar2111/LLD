package DesignPattern.Creational.AbstractFactory;

public class EuropeanCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeanSpecification();
    }
}
