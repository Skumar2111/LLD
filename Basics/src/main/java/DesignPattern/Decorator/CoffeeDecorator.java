package DesignPattern.Decorator;

public abstract class CoffeeDecorator {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract double cost();

    public abstract String description();
}
