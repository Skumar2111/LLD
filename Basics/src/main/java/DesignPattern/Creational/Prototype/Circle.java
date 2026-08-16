package DesignPattern.Creational.Prototype;

public class Circle extends Shape{

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Creating circle with color -> "+color);
    }
}
