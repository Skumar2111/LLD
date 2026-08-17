package DesignPattern.AbstractFactory;

public class EuropeanSpecification implements CarSpecification{
    @Override
    public void display() {
        System.out.println("Europe car standards");
    }
}
