package DesignPattern.Prototype;

public class ShapeMain {

    public static void main(String[] args) {

        Shape circle = new Circle("Blue");

        ShapeClient shapeClient = new ShapeClient(circle);

        shapeClient.createShape().draw();

    }
}
